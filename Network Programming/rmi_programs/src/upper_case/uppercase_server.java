package upper_case;

import java.rmi.Remote;
import java.rmi.RemoteException;

// String -> return type and toUpperCase(String str1) -> function call
public interface uppercase_server extends Remote{
    String toUpperCase(String str1) throws RemoteException;
}
