package lambda_expressions_concept;

interface Student {
    void studentData(String name) throws Exception;
}

public class exception_handling {
    public static void main(String[] args) {
        Student obj1 = 
                (name) -> {
                    System.out.println("The student name is : " + name);
                    throw new Exception();
                };
        
                try {
                    obj1.studentData("Prashanth");
                } catch(Exception e) { }
      }    
}
