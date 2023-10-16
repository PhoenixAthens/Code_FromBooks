package Core_Java_PartI_Fundamentals.UNI;
import java.rmi.*;
public class ClientRequest {
    public static void main(String...args){
        int answer, value = 25;
        try{
            Append access = (Append)Naming.lookup("rmi://localhost:1900/append");
            answer = access.append(25);
            System.out.println(answer);
        }catch(Exception ar){
            System.out.println(ar.getMessage());
        }
    }
}
