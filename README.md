# TP5

L'objectif du TP **Gestionnaire de sécurité** est de comprendre et de mettre en œuvre des mesures de sécurité dans le contexte de la gestion des sockets et des fichiers. 

1. **Sécurité lors du téléchargement de code**:
   - Lorsque on télécharge du code depuis un site distant, il est essentiel d'être prudent.
L'exécution de code provenant de sources inconnues peut être dangereuse.
La sécurité doit être une priorité pour éviter les vulnérabilités.

2. **Politique de sécurité**:
   - La politique de sécurité spécifie les actions autorisées dans votre application. Dans le contexte des sockets, elle détermine les autorisations de connexion et d'acceptation.
   - Les exemples de directives dans le fichier de politique (`policy file`) sont essentiels pour définir ces autorisations.

3. **Exemples de directives**:
   - La première directive permet d'utiliser les sockets comme indiqué :
     - `java.net.SocketPermission "*:1024-65535", "connect,accept"` : Autorise les connexions et les acceptations sur tous les ports entre 1024 et 65535.
     - `java.net.SocketPermission "*:80", "connect"` : Autorise uniquement les connexions sortantes sur le port 80 (HTTP).
   - Toute autre utilisation des sockets est interdite par défaut.
   - La deuxième directive autorise l'écriture dans le fichier "out.txt" :
     - `java.io.FilePermission "out.txt", "write"`
   - La troisième directive accorde toutes les permissions de sécurité :
     - `java.security.AllPermission`

En résumé, ce TP vise à sensibiliser à la sécurité lors de l'utilisation de sockets et à mettre en place des politiques de sécurité appropriées pour protéger votre application.
