package Core_Java_PartI_Fundamentals.UNI;
import java.rmi.*;
import java.rmi.server.*;
public class AppendDemo extends UnicastRemoteObject implements Append{
    public AppendDemo() throws RemoteException{
        super();
    }
    public int append(int a)throws RemoteException{
        int result;
        result = a+ base;
        return result;
    }
}
