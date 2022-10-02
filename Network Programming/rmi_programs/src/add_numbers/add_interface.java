package add_numbers;

import java.rmi.RemoteException;
import java.rmi.Remote;

// add_interface -> interface | method1 -> abstract method
public interface add_interface extends Remote {
    public String method1() throws RemoteException;
}
