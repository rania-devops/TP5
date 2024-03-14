package Server;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer extends UnicastRemoteObject implements RMIInterface {
    public RMIServer() throws RemoteException {
        super();
    }

    @Override
    public String helloTo(String name) throws RemoteException {
        return "Hello, " + name + "!";
    }

    // Autres méthodes spécifiques à votre application

    public static void main(String[] args) {
        try {
            // Charger dynamiquement les classes depuis un emplacement distant
            System.setProperty("java.rmi.server.codebase", "http://tp5.com/classes/");

            // Créer une instance de l'objet distant
            RMIInterface remoteObject = new RMIServerImpl();

            // Démarrer le registre RMI sur le port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Enregistrer l'objet distant auprès du registre
            registry.rebind("MyRemoteObject", remoteObject);

            System.out.println("Serveur RMI prêt !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
