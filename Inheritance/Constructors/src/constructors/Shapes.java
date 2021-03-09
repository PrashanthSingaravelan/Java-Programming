package constructors;
public class Shapes {
    
public static class Rectangle {
            int length,breadth;
        Rectangle() {                   // default constructor
                length = breadth = 1;       }
            
        Rectangle(int l,int b)  {      // parameterized constructor
                this.length = l;
                this.breadth = b;        }
}
        
public static class Cuboid extends Rectangle {
            int height;
            Cuboid() {                      // default constructor
                this.height = 1;       }
            
            Cuboid(int h) {              // parameterized constructor
                this.height = h;           }
            
            Cuboid(int l,int b,int h)  {             // parameterized constructor
                super(l,b);
                this.height = h;    }
            
            int volume() {
            return this.length * this.breadth * this.height; }
}
        
public static void main(String args[]) {
            Cuboid obj1 = new Cuboid(1,2,3);
            System.out.println("Volume of cuboid : " + obj1.volume());
    }

}


