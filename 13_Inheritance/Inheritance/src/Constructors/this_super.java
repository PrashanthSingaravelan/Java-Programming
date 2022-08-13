package Constructors;

public class this_super {
    
    public static class rectangle {
        int length;
        int breadth;
    
    public rectangle(int length, int breadth) {
        this.length  = length;
        this.breadth = breadth;
      }
    public void display() {
        System.out.println("Length  : " + this.length);
        System.out.println("Breadth : " + this.breadth);
    }    
}
    
    public static void main (String args[]) {
        rectangle obj1 = new rectangle(10,20);
        obj1.display();
    }
}
