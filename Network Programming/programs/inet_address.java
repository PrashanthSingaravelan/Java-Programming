import java.net.*;
import java.io.*;

public class inet_address {
    public static void main (String args[]) {
        
        try {
            String host = "google.com";
            
            InetAddress[] iAddress = InetAddress.getAllByName(host);
            for (InetAddress ipAddress : iAddress) {
                System.out.println(ipAddress.toString());
            }
        }
        
        catch (Exception e) { System.out.println(e); }
    }
}