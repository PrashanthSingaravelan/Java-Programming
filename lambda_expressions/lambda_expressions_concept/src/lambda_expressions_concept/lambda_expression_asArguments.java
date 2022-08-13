package lambda_expressions_concept;

interface My_lambda {   public void display();  }  // interface

class UseLambda {
    public void call_lambda(My_lambda obj1) {
            obj1.display();
    }
}

class demo {
    public void method1()   {
         UseLambda ul = new UseLambda();
         
         // definition of the abstract function [ display() ] of the interface [ My_lambda ]
         ul.call_lambda( () -> { System.out.println("Hello this is Prashanth"); } );  
    }
}

public class lambda_expression_asArguments  {
    public static void main(String[] args)  {
            demo obj1 = new demo();
            obj1.method1();
    }
}
