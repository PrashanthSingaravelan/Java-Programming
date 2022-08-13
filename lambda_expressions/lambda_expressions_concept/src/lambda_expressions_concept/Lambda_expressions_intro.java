package lambda_expressions_concept;

@FunctionalInterface
interface mylambda {
    public void display();
}

public class Lambda_expressions_intro {
    public static void main(String[] args) {
        
//        mylambda obj1 = new mylambda();
//        public void display() {
//                System.out.println("Hello World");
//        }
        
                mylambda obj1  = 
                    () -> {
                            System.out.println("Hello World");
                    };
                     obj1.display();
         }
}


