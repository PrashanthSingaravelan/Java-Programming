package upper_case;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.AlreadyBoundException;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class rmi_server_implementation implements uppercase_server{
    
    // Remote object initialization (Default Constructor)
    public rmi_server_implementation() throws RemoteException {
        UnicastRemoteObject.exportObject(this, 0);
    }
    
    // Defining the abstract methods
    @Override
    public String toUpperCase(String str1) throws RemoteException {
        return str1.toUpperCase(); 
    }
    
    public static void main(String args[]) throws RemoteException, AlreadyBoundException {
        uppercase_server stub    = new rmi_server_implementation();      // calling the Default Constructor
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.bind("Server", stub);
        System.out.println("Server started ....");
    }
}
