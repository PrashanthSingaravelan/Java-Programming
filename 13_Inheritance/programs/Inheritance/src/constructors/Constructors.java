package constructors;
public class Constructors {
 
public static class Parent {
            public Parent() {
            System.out.println("Parent class");            
                }
        }

        public static class Child extends Parent{
            public Child() {
            System.out.println("Child class");            
                }
        }
        
        public static class GrandChild extends Child {
            public GrandChild() {
            System.out.println("Grand-child class");            
                }
        }

public static void main(String[] args) {        
     GrandChild obj1 = new GrandChild();
    }
}
