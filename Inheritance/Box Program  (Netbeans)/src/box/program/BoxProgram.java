package box.program;
class Box {
        double width;
        double height;
        double depth;
        
        Box(Box obj1) {
            this.width  = obj1.width;
            this.height = obj1.height;
            this.depth  = obj1.depth;
        }
        
         // Constructor  When all dimensions are specified
        Box(double w,double h,double d) {
            width = w;
            height = h;
            depth = d;            
        }
        
        // Constructor When all dimensions are not specified
        Box() {
            width  = -1;
            height = -1;
            depth  = -1;
        }
        
        // Constructor, When cube is created
        Box(double len) {
            this.width = this.height = this.depth=len;
        }
        
        double volume() {
            return this.width * this.height * this.depth;
        }
}

class BoxWeight extends Box {
    double weight ; 
    BoxWeight(double w,double h,double d,double m) {
        this.width = w;
        this.height = h;
        this.depth = d;
        this.weight = m;
    }
}
public class BoxProgram {

    public static void main(String[] args) {
        BoxWeight obj1 = new BoxWeight(10,20,15,34.3);
        BoxWeight obj2 = new BoxWeight(2,3,4,0.076);
        double vol;
        vol = obj1.volume();
        System.out.println("Volume of the box : " + vol);
        System.out.println("Weight of the box : " + obj1.weight);
        
        vol = obj2.volume();
        System.out.println("Volume of the box : " + vol);
        System.out.println("Weight of the box : " + obj2.weight);
        
    }
}
