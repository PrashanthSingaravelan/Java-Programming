package rmi_programs;

import java.rmi.Remote;
import java.rmi.RemoteException;

// String -> return type || toUpperCase(String str1) -> function call
public interface uppercase_interface extends Remote    {
    
    // Declaring th abstract method
    String toUpperCase(String str1) throws RemoteException;
}
