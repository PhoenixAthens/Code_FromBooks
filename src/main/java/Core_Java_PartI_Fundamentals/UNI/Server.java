package Core_Java_PartI_Fundamentals.UNI;
import java.net.*;
import java.io.*;
public class Server {
    //Server.java

    //initialize socket and input stream
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream stream = null;

    // constructor - port number as argument
    public Server(int port){
            try{
                //create a server socket on a specified port number
                server = new ServerSocket(port);
                System.out.println("Server started at port: "+port);

                System.out.println("Waiting for client...");
                socket = server.accept();
                System.out.println("Client accepted!");

                // takes input from the client socket
                stream = new DataInputStream(
                        new BufferedInputStream(socket.getInputStream()));
                String line = "";

                //// reads message from client until "EOF" is sent
                while(!line.equals("EOF")){
                    try{
                        line = stream.readUTF();
                        System.out.println(line);
                    }catch(IOException e){
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println("Closing connection!");

                //close connection
                socket.close();
                stream.close();
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
    }
    public static void main(String... args){
        Server server1 = new Server(2800);
    }
}
