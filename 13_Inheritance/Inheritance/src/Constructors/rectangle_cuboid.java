package Constructors;

class rectangle {
    // private members
        int length;
        int breadth;
        int temp = 100;
        
        public rectangle()                      { this.length = this.breadth = 1; }
        public rectangle(int l, int b) { 
            this.length = l;
            this.breadth = b;
        }
}

class cuboid extends rectangle {
    // private members
        int height;
        int temp = 200;
        
        public cuboid()                         { this.height = 1; }
        public cuboid(int h)                    { this.height = h; }
        public cuboid(int l, int b, int h) {
            super(l,b);
            this.height = h;
        }
        int volume()        { return this.length*this.height*this.height; }
        
        void display() {
            System.out.println("this.temp  : " + this.temp);
            System.out.println("super.temp : " + super.temp);
        }
}

public class rectangle_cuboid {
    public static void main(String[] args) {
        cuboid obj1 = new cuboid(2,3,4);
        System.out.println("Cuboid volume : " + obj1.volume());
        obj1.display();
      }
 }

