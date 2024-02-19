import java.io.*;
import java.net.*;

public class ClientTCP {
    public static void main(String[] args) {
        final String SERVER_ADDRESS = "localhost";
        final int SERVER_PORT = 12345;

        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT)) {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Envoi d'un message au serveur
            String message = "Bonjour, serveur!";
            out.println(message);
            System.out.println("Message envoyé au serveur : " + message);

            // Lecture de la réponse du serveur
            String response = in.readLine();
            System.out.println("Réponse du serveur : " + response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
