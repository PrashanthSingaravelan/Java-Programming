package inheritance_concept;

                class box {
                private double width;       private double height;          private double depth;
                box(box ob)         {   width = ob.width;       height = ob.height;               depth = ob.depth; }
                box(double w, double h, double d)       {     width = w;    height = h;           depth = d;      }   
                box()                    {   width = -1;            height = -1;                     depth = -1;                    }
                box(double len)   {   width = height = depth = len;   }
                double volume()  {   return width * height * depth;      }
                }

                class boxWeight extends box {
                double weight; 
                boxWeight(boxWeight ob)  
                                                            {   super(ob);  weight = ob.weight;            }
                
                boxWeight(double w, double h, double d, double m)       
                                                            {   super(w, h, d); weight = m;     }
                
                boxWeight()                        {   super();    weight = -1;}
                boxWeight(double len, double m)         
                                                            {   super(len);     weight = m;     }
                }

public class super_box_program {
                public static void main(String[] args) {
                boxWeight mybox1 = new boxWeight(10, 20, 15, 34.3);
                boxWeight mybox2 = new boxWeight(2, 3, 4, 0.076);
                boxWeight mybox3 = new boxWeight(); 
                boxWeight mycube = new boxWeight(3, 2);
                boxWeight myclone = new boxWeight(mybox1);
            double vol;
            vol = mybox1.volume();
            System.out.println("Volume of mybox1 is " + vol);
            System.out.println("Weight of mybox1 is " + mybox1.weight);
            System.out.println();
            
            vol = mybox2.volume();
            System.out.println("Volume of mybox2 is " + vol);
            System.out.println("Weight of mybox2 is " + mybox2.weight);
            System.out.println();
            
            vol = mybox3.volume();
            System.out.println("Volume of mybox3 is " + vol);
            System.out.println("Weight of mybox3 is " + mybox3.weight);
            System.out.println();
            
            vol = myclone.volume();
            System.out.println("Volume of myclone is " + vol);
            System.out.println("Weight of myclone is " + myclone.weight);
            System.out.println();
            
            vol = mycube.volume();
            System.out.println("Volume of mycube is " + vol);
            System.out.println("Weight of mycube is " + mycube.weight);
            System.out.println();
    }
}



