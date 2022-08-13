package inheritance_concept;

class box_1 {
private double width;       private double height;      private double depth;
       box_1(box_1 ob)      {   width = ob.width;       height = ob.height;     depth = ob.depth;        }
       box_1(double w, double h, double d) 
                                       {   width = w;  height = h;  depth = d;     }
       box_1()                    {   width = -1; height = -1; depth = -1; }
       box_1(double len)  {   width = height = depth = len;     }
       double volume()     {   return width * height * depth;    }
}

class box_1Weight extends box_1 {
            double weight; 
            box_1Weight(box_1Weight ob)           {   super(ob);    weight = ob.weight;   }
            box_1Weight(double w, double h, double d, double m) 
                                                                         {   super(w, h, d); weight = m; }
            box_1Weight()                                      {   super();    weight = -1;    }
            box_1Weight(double len, double m)   {   super(len);     weight = m;     }
}

class Shipment extends box_1Weight {
            double cost;
            Shipment(Shipment ob)                              {   super(ob);      cost = ob.cost;     }
            Shipment(double w, double h, double d,double m, double c) 
                                                                                  {  super(w, h, d, m); cost = c;}
            Shipment()                                                    {  super();    cost = -1;  }
            Shipment(double len, double m, double c) {  super(len, m);  cost = c;   }
}

public class multi_level_box_program {
                public static void main(String[] args) {
                Shipment shipment1 =  new Shipment(10, 20, 15, 10, 3.41);
                Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
                double vol;
                vol = shipment1.volume();
                System.out.println("Volume of shipment1 is " + vol);
                System.out.println("Weight of shipment1 is "+ shipment1.weight);
                System.out.println("Shipping cost: $" + shipment1.cost);
                System.out.println();

                vol = shipment2.volume();
                System.out.println("Volume of shipment2 : " + vol);
                System.out.println("Weight of shipment2  : "+ shipment2.weight);
                System.out.println("Shipping cost  : $" + shipment2.cost);
        }
}
