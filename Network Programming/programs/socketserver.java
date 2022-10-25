package connection_oriented;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
/**
*
* @author THARUN
*/
public class socketserver {
 public static void main(String args[]) throws IOException{
 ServerSocket ss=new ServerSocket(4502);
 System.out.println("Server started...");
 Socket s=ss.accept();
 
 // DataInputStream creates an input stream to receive input from the client.
 DataInputStream din=new DataInputStream(s.getInputStream());
 //DataOutputStream creates an output stream to send information to the client.
 DataOutputStream dout=new DataOutputStream(s.getOutputStream());
 
 BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
 String str="", str2="";
 while(!str.equals("stop")){
 str2=br.readLine();
 dout.writeUTF(str2);
 str=din.readUTF();
 System.out.println("client says : "+str);
 dout.flush(); 
 }
 }
}