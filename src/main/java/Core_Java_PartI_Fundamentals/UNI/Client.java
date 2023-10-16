package Core_Java_PartI_Fundamentals.UNI;
import java.io.*;
import java.net.*;
public class Client {
    // initialize socket and input output streams
    private Socket socket = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;

    // constructor - receives IP address and port
    public Client(String ipAddress, int port){
       try{
           //establish a connection
           socket = new Socket(ipAddress,port);
           System.out.println("Connected!");

           //for reading input from terminal
           in = new DataInputStream(System.in);

           //for sending output to the socket
           out = new DataOutputStream(socket.getOutputStream());
       }catch(IOException e){
           System.out.println(e.getMessage());
       }

        // string to read message from input
        String line = "";

        // keep reading until "EOFr" is input
        while(!line.equals("EOF")){
            try{
                line = in.readUTF();
                out.writeUTF(line);
            }catch(IOException exception){
                System.out.println(exception.getMessage());
            }
        }

        //close connection
        try{
            in.close();
            out.close();
            socket.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String...args){
        Client client = new Client("192.168.0.144", 2800);
    }
}
