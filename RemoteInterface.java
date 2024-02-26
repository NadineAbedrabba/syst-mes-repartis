import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
    String convertToUpper(String input) throws RemoteException;
}