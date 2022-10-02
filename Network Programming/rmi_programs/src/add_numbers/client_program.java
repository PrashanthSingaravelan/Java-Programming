package add_numbers;

import java.rmi.Naming;

public class client_program {
    public static void main (String args[]) {
        try{  
           add_interface_implement client_obj = (add_interface_implement)Naming.lookup("rmi://localhost:8080/service_1");
           System.out.println(client_obj.method1());
        } 
        
        catch (Exception e) { 
            System.out.println("Client Exception : " + e); 
        }
    }
}
