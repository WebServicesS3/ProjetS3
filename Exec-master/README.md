# Exec

Logiciels requis :
- java version jdk 1.7
- Eclipse version JEE developper
- Gradle https://docs.gradle.org/current/userguide/installation.html
- client github
- Apache/Tomcat version http://tomcat.apache.org/download-70.cgi version binaire

Installation :
- Télécharger le Zip du projet
- Décompresser
- Utiliser la commande  gradle build  pour compiler le projet
- Utiliser la commande  gradle eclipse  pour convertir le projet Gradle en projet Eclipse
- Importer le projet sous Eclipse : File -> Import -> Existing project into workspace
- Ajouter Apache/Tomcat à Eclipse : Windows -> preferences -> Server -> Runtime Environment -> Add -> Apache Tomcat 7 -> next -> brower vers le dossier où est Apache/Tomcat
- Démarrage : clic droit sur projet -> run as -> run on server...

Test :
- ouvrir un navigateur et saisir l'adresse :
http://localhost:8080/Exec/exec/code

