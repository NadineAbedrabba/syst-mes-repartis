import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import Serveur.GestionTaches;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            GestionTaches gestionTaches = (GestionTaches) registry.lookup("GestionTaches");
            Scanner scanner = new Scanner(System.in);
            
            while (true) {
                System.out.println("1. Ajouter une tâche");
                System.out.println("2. Supprimer une tâche");
                System.out.println("3. Afficher la liste des tâches");
                System.out.println("4. Quitter");
                System.out.print("Choix : ");
                int choix = scanner.nextInt();
                scanner.nextLine(); // Consommer la nouvelle ligne après le choix
                
                switch (choix) {
                    case 1:
                        System.out.print("Entrez la nouvelle tâche : ");
                        String nouvelleTache = scanner.nextLine();
                        gestionTaches.ajouterTache(nouvelleTache);
                        break;
                    case 2:
                        System.out.print("Entrez la tâche à supprimer : ");
                        String tacheASupprimer = scanner.nextLine();
                        gestionTaches.supprimerTache(tacheASupprimer);
                        break;
                    case 3:
                        List<String> taches = gestionTaches.recupererListeTaches();
                        System.out.println("Liste des tâches : ");
                        for (String tache : taches) {
                            System.out.println("- " + tache);
                        }
                        break;
                    case 4:
                        System.out.println("Au revoir !");
                        System.exit(0);
                    default:
                        System.out.println("Choix invalide !");
                }
            }
        } catch (Exception e) {
            System.err.println("Erreur du client : " + e.getMessage());
        }
    }
}

