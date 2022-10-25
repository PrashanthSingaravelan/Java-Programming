package connection_oriented;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class server_program {
 public static void main(String args[]) throws IOException{
    try  {
        // initialize the socket
        ServerSocket server_socket1 = new ServerSocket(4502);
        // accepting the connection from the client
        Socket  server_socket2           = server_socket1.accept();
        System.out.println("Client is connected......");

        //DataInputStream class --> input stream to receive a request from the client. 
        DataInputStream d_in = new DataInputStream(server_socket2.getInputStream());

        //DataOutputStream class -> output stream to send response to the client. 
        DataOutputStream d_out = new DataOutputStream(server_socket2.getOutputStream());
        BufferedReader br      = new BufferedReader(new InputStreamReader(System.in));

        String str1="", str2="";

        while (!str1.equals("stop"))    {
                str1 = br.readLine();
                d_out.writeUTF(str1);
                d_out.flush();

                str2 = d_in.readUTF();
                System.out.println("Client says : " + str2);
                d_out.flush();
        }

        d_out.close();
        d_in.close();

        // Closing the client socket
        server_socket1.close();

    }  catch(Exception e)   {   e.printStackTrace();    }
  }
}