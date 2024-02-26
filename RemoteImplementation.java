import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;


public class RemoteImplementation extends UnicastRemoteObject implements RemoteInterface  {
    public RemoteImplementation() throws RemoteException {
        super();
    }

    @Override
    public String convertToUpper(String input) throws RemoteException {
        return input.toUpperCase();
    }
    
}
