package Core_Java_PartI_Fundamentals.UNI;
import java.rmi.*;
import java.rmi.registry.*;
public class AppendServer {
    public static void main(String...args){
        try{
            Append obj = new AppendDemo();
            LocateRegistry.createRegistry(1900);
            Naming.rebind("rmi://localhost:1900"+"/append",obj);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
