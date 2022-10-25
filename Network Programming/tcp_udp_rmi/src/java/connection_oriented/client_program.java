package connection_oriented;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class client_program {
 public static void main(String args[]) throws IOException{
 
        try {
            // initialize the socket 
            Socket client_socket = new Socket("localhost", 20);

            //DataOutputStream class -> output stream to send request to the server. 
            DataOutputStream d_out = new DataOutputStream(client_socket.getOutputStream());
            BufferedReader br      = new BufferedReader(new InputStreamReader(System.in));

           //DataInputStream class --> input stream to receive a response from the server. 
            DataInputStream d_in = new DataInputStream(client_socket.getInputStream()); 

            String str1="",str2="";
            
            while(!str1.equals("stop")){
                str1  = d_in.readUTF(); // reading from server
                System.out.println("Server says : "+str1);
                System.out.println("Your Answer : ");
                str2  = br.readLine();   // reading from client which I typed
                d_out.writeUTF(str2);
                d_out.flush();    
            }

            d_out.close();
            d_in.close();
            
            // Closing the client socket
            client_socket.close();  
        } catch (Exception e)       {   System.out.println(e);      }
    }
}