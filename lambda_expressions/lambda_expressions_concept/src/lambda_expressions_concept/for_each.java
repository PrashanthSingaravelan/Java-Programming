package lambda_expressions_concept;

import java.util.ArrayList;
import java.util.List;

public class for_each {
    public static void main(String[] args) {
        ArrayList<String> obj1 = new ArrayList<String>();
        obj1.add("Prashanth");
        obj1.add("Sabarinathan");
        obj1.add("Mothish");
        obj1.forEach(System.out::println);      
    } 
}
