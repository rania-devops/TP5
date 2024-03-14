EX1 :
question a:

* Le fichier server.policy permet au serveur d’objets d’avoir toutes les permissions.
* Les fichiers client.policy et client2.policy autorisent le client à se connecter au registre RMI (rmiregistry) et à résoudre les connexions réseau.

Question b:
En conclusion, l’implémentation d’une application Java RMI pour inverser une chaîne de caractères (ReverseVersion2) a été réalisée avec succès. Nous avons mis en place un gestionnaire de sécurité (RMISecurityManager) pour le serveur d’objets et le client, garantissant ainsi une exécution sécurisée des opérations RMI. Les fichiers de politique de sécurité (server.policy, client.policy et client2.policy) ont été créés pour définir les autorisations appropriées. Cette approche permet une personnalisation efficace des interactions avec les clients tout en maintenant un niveau de sécurité adéquat. Le serveur et le client ont été adaptés pour inclure cette instruction, renforçant ainsi la robustesse de l’application distribuée. 

Question c:
En conclusion, pour mettre en œuvre une application RMI avec chargement dynamique de classes, nous avons suivi les étapes suivantes :

1. **Écriture des classes** :
   - Nous avons créé une **interface distante** (`RMIInterface`) qui définit les méthodes que le serveur et le client peuvent invoquer.
   - Nous avons également implémenté une **classe de serveur** (`RMIServer`) qui étend `UnicastRemoteObject` et fournit l'implémentation des méthodes de l'interface.

2. **Compilation des classes** :
   - Nous avons utilisé la commande `javac` pour compiler les fichiers source (`.java`) en fichiers de classe (`.class`).
   - Par exemple :
     ```
     javac RMIInterface.java RMIServer.java
     ```

3. **Conclusion** :
   - Le chargement dynamique de classes permet de partager efficacement les définitions de classe entre les clients et le serveur.
   - En utilisant l'interface distante et l'objet distant, nous avons créé une application RMI qui peut être exécutée sur différentes machines.
   - La sécurité est prise en compte grâce aux classes `java.rmi.RMISecurityManager` et `java.rmi.server.RMIClassLoader`.
   - La compilation des classes est essentielle pour générer les fichiers de classe exécutables nécessaires à l'exécution de l'application.
     
 ----------generations des stubs

   - Le Stub est généré automatiquement à l'aide de l'outil `rmic` (ou `rmiregistry`).
   - Exécutez la commande suivante pour générer le Stub :
    
     rmic RMIServer
   - Cela générera un fichier `RMIServer_Stub.class`.


 **Compilation du Stub** :
   - Compilation du Stub généré avec nos autres fichiers de classe :
     javac RMIServer_Stub.java
     

Le Stub permet au client de communiquer avec l'objet distant sans avoir à connaître les détails de la communication RMI sous-jacente. Il agit comme un proxy pour l'objet distant, gérant la sérialisation, la désérialisation et la communication réseau.

------- serveur dynamique

En conclusion, le chargement dynamique de classes en Java RMI offre une flexibilité essentielle pour les applications distribuées. En utilisant l'interface distante et l'objet distant, nous avons créé un serveur dynamique capable de charger les classes nécessaires à partir d'un emplacement distant spécifié. La sécurité est prise en compte grâce aux classes `java.rmi.RMISecurityManager` et `java.rmi.server.RMIClassLoader`, qui vérifient le contexte de sécurité avant de charger des classes à partir d'emplacements distants. En générant le Stub correspondant à l'objet, nous avons facilité la communication entre le client et le serveur. En résumé, le chargement dynamique de classes améliore l'efficacité et la personnalisation des interactions dans une application RMI  .

