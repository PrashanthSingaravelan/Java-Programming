import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class datagram_socket_packet_server {
    public static void main (String args[]) {
        try {
             int listen_port_number   = 15000;
             DatagramSocket ds = new DatagramSocket(listen_port_number);
            
            // receive the data packets from the client
            byte str_bytes1[]      = new byte[1024];  // data will be accepted only in byte array format
            DatagramPacket dp1  = new DatagramPacket(str_bytes1,str_bytes1.length);
            ds.receive(dp1);
            
            String str1 = new String(dp1.getData(), 0, dp1.getLength());
            int num     = Integer.parseInt(str1.trim());
            System.out.println("Server receives : " + num); 
            int result = num*num;
            byte str_bytes2[] = String.valueOf(result).getBytes(); // converting the results back to bytes
            
            InetAddress ip_address = InetAddress.getLocalHost();  // local host of client machine
            //int port_number        = dp1.getPort(); 
            System.out.println("IP address  : " + InetAddress.getLocalHost());
            System.out.println("port Number : " + dp1.getPort());
            DatagramPacket dp2 = new DatagramPacket(str_bytes2, str_bytes2.length,ip_address, dp1.getPort());
            ds.send(dp2); 
            
        } catch (Exception e) { System.out.println(e); }
    }
}