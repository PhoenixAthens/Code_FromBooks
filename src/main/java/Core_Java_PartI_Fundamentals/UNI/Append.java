package Core_Java_PartI_Fundamentals.UNI;
import java.rmi.*;
public interface Append extends Remote{
    int base = 100;
    public int append(int a)throws RemoteException;
}
