package Server;
import java.io.*;
import java.net.*;

public class ReverseServer {
    public static void main(String[] args) {
        try {
            // Vérifier si un gestionnaire de sécurité est déjà défini
            if (System.getSecurityManager() == null) {
                System.setSecurityManager(new SecurityManager());
            }

            // Créer le serveur socket
            ServerSocket serverSocket = new ServerSocket(8090);
            System.out.println("Serveur en attente de connexion...");

            // Accepter la connexion du client
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connecté.");

            // Flux d'entrée et de sortie
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Lire la chaîne envoyée par le client
            String inputString = in.readLine();
            System.out.println("Chaîne reçue du client : " + inputString);

            // Inverser la chaîne
            String reversedString = new StringBuilder(inputString).reverse().toString();

            // Envoyer la chaîne inversée au client
            out.println(reversedString);

            // Fermer les flux et la connexion
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
