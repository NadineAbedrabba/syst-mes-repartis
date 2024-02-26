import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            RemoteInterface remoteObject = new RemoteImplementation();
            LocateRegistry.createRegistry(1099); // Port par défaut pour RMI
            Naming.rebind("RemoteObject", remoteObject);
            System.out.println("Server is running...");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
    
}
