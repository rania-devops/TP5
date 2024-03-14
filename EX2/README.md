EX2:
Question a:
En conclusion, l'implémentation réussie de l'application Java RMI pour inverser une chaîne de caractères (ReverseVersion2) avec une usine (Factory) et un gestionnaire de sécurité a été réalisée. 
Le serveur et le client ont été rendus dynamiques, permettant un chargement flexible des classes à partir d'un emplacement distant.
Le serveur, renommé en `DynamicReverseServer`, a été configuré pour charger dynamiquement les classes nécessaires à partir d'une URL spécifiée. 
La sécurité a été prise en compte grâce au gestionnaire de sécurité RMI. 
En résumé, cette application offre une communication sécurisée et flexible entre les clients et le serveur, tout en optimisant l'utilisation des ressources .  

Question b:
En conclusion, l'implémentation réussie d'une application Java RMI avec chargement dynamique de classes a été réalisée. 
Le client, renommé en `DynamicClient`, est capable de charger les classes nécessaires à partir d'un emplacement distant spécifié. 
L'utilisation du Stub généré permet une communication transparente entre le client et l'objet distant. En résumé, cette approche offre une flexibilité accrue dans la gestion des classes et des objets distants dans une application RMI distribuée  . 

Question c:
En conclusion, lors de la mise en œuvre de notre application Java RMI avec chargement dynamique de classes, nous avons suivi les étapes suivantes :

1. **Hébergement des classes** :
   - Nous avons créé un dossier nommé "www" pour héberger nos fichiers de classe.
   - Les classes du serveur et du client ont été déplacées manuellement dans ce dossier, à l'exception des fichiers spécifiques (par exemple, `DynamicReverseServer.java`, `DynamicReverseServer.class`, `Server.policy`, etc.).

2. **Lancement du serveur dynamique** :
   - Nous avons lancé le serveur dynamique en spécifiant le fichier de politique de sécurité (`server.policy`) et l'URL des fichiers de classe (`file:///home/louati1/IF4/TP5/Reverse1/www/`).
   - Par exemple :
     ```
     java -Djava.security.policy=server.policy -Djava.rmi.server.codebase=file:///home/louati1/IF4/TP5/Reverse1/www/ DynamicReverseServer
     ```

3. **Lancement du client dynamique** :
   - Nous avons lancé le client dynamique avec les mêmes paramètres de sécurité et d'URL des fichiers de classe.
   - Par exemple :
     ```
     java -Djava.security.policy=client.policy -Djava.rmi.server.codebase=file:///home/louati1/IF4/TP5/Reverse1/www/ DynamicClient Bonjour IF4
     ```

En résumé, l'hébergement des classes sur un serveur Web (ou dans un dossier local) permet une gestion efficace des ressources et une communication sécurisée entre le serveur et les clients dans notre application RMI distribuée .
