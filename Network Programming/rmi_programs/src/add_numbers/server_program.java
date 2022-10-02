package add_numbers;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class server_program {
    public static void main (String args[]) {
        try {
            add_interface_implement server_obj = new add_interface_implement("Sample string");
            
            // Adding skeleton(remote object) in registry, so that it can be accessed remotely
            Naming.rebind("service_1", server_obj);
            System.out.println("Server is ready");  
        } 
        
        catch(MalformedURLException | RemoteException e) { System.out.println("Server Failed " + e); }
    }
}
