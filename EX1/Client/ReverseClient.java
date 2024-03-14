package Client;
import java.io.*;
import java.net.*;

public class ReverseClient {
    public static void main(String[] args) {
        try {
            // Vérifier si un gestionnaire de sécurité est déjà défini
            if (System.getSecurityManager() == null) {
                System.setSecurityManager(new SecurityManager());
            }

            // Établir la connexion avec le serveur
            Socket socket = new Socket("localhost", 8090);

            // Flux d'entrée et de sortie
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Saisie de la chaîne à inverser
            System.out.print("Entrez une chaîne : ");
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String inputString = userInput.readLine();

            // Envoyer la chaîne au serveur
            out.println(inputString);

            // Recevoir la chaîne inversée du serveur
            String reversedString = in.readLine();
            System.out.println("Chaîne inversée reçue du serveur : " + reversedString);

            // Fermer les flux et la connexion
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
