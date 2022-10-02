package add_numbers;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class add_interface_implement extends UnicastRemoteObject implements add_interface {
    private String message;
    
    // Parameterized Constructor
    public add_interface_implement(String msg) throws RemoteException { 
        this.message = msg; 
    }
    
    // Defining the method
    @Override
    public String method1() throws RemoteException { 
        return this.message; 
    }
}
