package upper_case;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class rmi_client {
    
    private uppercase_server server_obj;
    
    // Locating the stub in registry
    public void start_client() throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        server_obj        = (uppercase_server)registry.lookup("Server");
    }
    
    // Call --> toUpperCase(arguemnt)
    public String toUpperCase(String argument)  {
        String result = null;
        try                       { result = server_obj.toUpperCase(argument); } 
        catch (RemoteException e) { throw new RuntimeException("Could not contact the server");}    
        return result;
    }
    
    public static void main (String args[]) throws RemoteException, NotBoundException {
        rmi_client skeleton = new rmi_client();
        skeleton.start_client();
        
        Scanner in = new Scanner(System.in); // reading the user inputs
        while (true) {
            System.out.println("Input > ");
            String line = in.nextLine();  

            if (line.equalsIgnoreCase("exit")) break;
            
            String result = null;
            try {                                          // trying to connect the server
                result = skeleton.toUpperCase(line);       // lower string to upper string
                System.out.println("Result > " + result);  // printing the output
            }
            catch (Exception e) { System.out.println("Error : " + e.getMessage()); }
        }
    }
}
