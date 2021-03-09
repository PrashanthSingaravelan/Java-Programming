package constructors;
public class super_constructor {

public static class Parent {
            public Parent() {
            System.out.println("Default constructor --> Parent class");     }
            
            public Parent(int x)      {
                System.out.println("Parameter constructor --> Parent class  X : " + x);     }
}

public static class Child extends Parent{
            public Child() {
            System.out.println("Default constructor --> Child class");       }
            
            public Child(int x)     {
                super(x);
                System.out.println("Parameter constructor --> Child class  X : " + x);      }
}
        
public static class GrandChild extends Child {
            public GrandChild() {
            System.out.println("Default constructor --> Grand-child class");     }
            
            public GrandChild(int x)     {
                super(x);
                System.out.println("Parameter constructor --> Grand-child class  X : " + x);    }
}

public static void main(String[] args)              {        
     GrandChild obj1 = new GrandChild(10);
    }

}

