import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class GestionTachesImpl extends UnicastRemoteObject implements GestionTaches {
    private List<String> listeTaches;

    public GestionTachesImpl() throws RemoteException {
        super();
        listeTaches = new ArrayList<>();
    }

    public void ajouterTache(String tache) throws RemoteException {
        listeTaches.add(tache);
    }
    public void supprimerTache(String tache) throws RemoteException {
        listeTaches.remove(tache);
    }

    public List<String> recupererListeTaches() throws RemoteException {
        return new ArrayList<>(listeTaches);
    }
}

    
