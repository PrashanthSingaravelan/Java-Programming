import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class datagram_socket_packet_client {
    public static void main (String args[]) {
        try {
            DatagramSocket ds     = new DatagramSocket(); 
            
            // send the data to the server
            int num1 = 10;
            System.out.println("Client sends : " + num1); 
            byte int_bytes1[]      = String.valueOf(num1).getBytes();  // integer -> string -> bytes
                
            InetAddress ip_address = InetAddress.getLocalHost();  // local host of the client machine
            int client_port_number        = 15000;  // port number of the application
            DatagramPacket dp1     = new DatagramPacket(int_bytes1,int_bytes1.length,ip_address,client_port_number);
            ds.send(dp1);  // sending packets to the server
            
            // receive the data from the server
            byte str_bytes1[]  = new byte[1024];
            DatagramPacket dp2 = new DatagramPacket(str_bytes1,str_bytes1.length);
            ds.receive(dp2);
            
            // received data (bytes) -> strings
            String str1 = new String(dp2.getData(), 0, dp2.getLength());
            System.out.println("IP address  : " + InetAddress.getLocalHost());
            System.out.println("port Number : " + dp2.getPort());
            System.out.println("Client receives and result is : " + str1);
            
        } catch (Exception e) { System.out.println(e); }
    }
}