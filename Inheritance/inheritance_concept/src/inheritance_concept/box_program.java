package inheritance_concept;

class Box {
        double width;   double height;  double depth;
        
        Box(Box obj1) {
            this.width  = obj1.width;
            this.height = obj1.height;
            this.depth  = obj1.depth;
        }
        
        // Constructor (default --> When all dimensions are not specified)
        Box()   {        width  = -1;         height = -1;            depth  = -1;        }
        
         // Constructor  When all dimensions are specified
        Box(double w,double h,double d)     {       width = w;       height = h;           depth = d;         }
        
        // Constructor, When cube is created
        Box(double len)         {       this.width = this.height = this.depth=len;        }
        
        double volume()         {      return this.width * this.height * this.depth;        }
}

class BoxWeight extends Box {
    double weight ; 
    BoxWeight(double w,double h,double d,double m) {
        this.weight = m;
        this.height = h;        this.depth = d;       this.width = w;       
    }
}

public class box_program {
    public static void main(String[] args) {
        BoxWeight obj1 = new BoxWeight(10,20,15,34.3);
        BoxWeight obj2 = new BoxWeight(2,3,4,0.076);
        double vol;
        
        vol = obj1.volume();
        System.out.println("Volume of the box-1 : " + vol);
        System.out.println("Weight of the box-1  : " + obj1.weight);
        
        vol = obj2.volume();
        System.out.println("\nVolume of the box-2 : " + vol);
        System.out.println("Weight of the box-2  : " + obj2.weight);
    }
}
