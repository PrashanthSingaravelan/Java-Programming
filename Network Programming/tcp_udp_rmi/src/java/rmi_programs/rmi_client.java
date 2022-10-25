package rmi_programs;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class rmi_client {
    
    private uppercase_interface client_obj;  // client's remote object
    
    // Locating the stub in registry
    public void start_client() throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1099);
        client_obj        = (uppercase_interface)registry.lookup("Server");
    }
    
    // Call --> toUpperCase(arguemnt)
    public String toUpperCase(String argument)  {
        String result = null;
        try                       { result = client_obj.toUpperCase(argument);        } 
        catch (RemoteException e) { throw new RuntimeException("Could not contact the server"); }    
        return result;
    }
    
    public static void main (String args[]) throws RemoteException, NotBoundException {
        rmi_client stub_obj = new rmi_client();
        stub_obj.start_client();
        
        Scanner in = new Scanner(System.in); // reading the user inputs
        while (true) {
            System.out.print("Input > ");
            String str1 = in.nextLine();  

            if (str1.equalsIgnoreCase("exit")) break;
            
            String result = null;
            try {                                          // trying to connect the server
                result = stub_obj.toUpperCase(str1);       // lower string to upper string
                System.out.println("Result > " + result);  // printing the output
            }
            catch (Exception e) { System.out.println("Error : " + e.getMessage()); }
        }
    }
}
