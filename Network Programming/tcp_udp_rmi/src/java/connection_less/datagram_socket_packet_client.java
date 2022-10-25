package connection_less;

import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Scanner;

public class datagram_socket_packet_client {
    public static void main (String args[]) {
    try {
        DatagramSocket ds     = new DatagramSocket(); 

        // send the data to the server
        System.out.print("Enter a number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        byte int_bytes1[]      = String.valueOf(n).getBytes();  // integer -> string -> bytes
        
        InetAddress ip_address = InetAddress.getByName("127.0.0.1");
        
        // InetAddress ip_address = InetAddress.getLocalHost();  // local host of the datagram_socket_packet_client machine
        int client_port_number = 15000;  // port number of the application
        DatagramPacket dp1     = new DatagramPacket(int_bytes1,int_bytes1.length,ip_address,client_port_number);
        ds.send(dp1);  // sending packets to the server
        System.out.println("Client sends the number : " + n);

        // receive the data from the server
        byte str_bytes1[]  = new byte[1024];
        DatagramPacket dp2 = new DatagramPacket(str_bytes1,str_bytes1.length);
        ds.receive(dp2);

        // received data (bytes) -> strings
        String str1 = new String(dp2.getData(), 0, dp2.getLength());
        System.out.println("Client receives and the result is : " + str1);
            
        } catch (Exception e) { System.out.println(e); }
    }
}

