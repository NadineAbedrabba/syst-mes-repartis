
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Serveur {
      public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("GestionTaches", new GestionTachesImpl());
            System.out.println("Serveur prêt.");
        } catch (Exception e) {
            System.err.println("Erreur du serveur : " + e.getMessage());
        }
    }
}
