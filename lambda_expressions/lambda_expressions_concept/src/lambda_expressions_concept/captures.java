package lambda_expressions_concept;

interface mylambda_3 {
         public void display();
}

class Demo {
    public void method_1()    {
        int temp = 0;  
         mylambda_3 m1 = 
                 () -> {
                     System.out.println("Hi");
                     System.out.println("The value of count : " + temp);
                 };
         m1.display();
    }
}

public class captures {
    public static void main(String[] args) {
            Demo obj1 = new Demo();
            obj1.method_1();
    }
}
