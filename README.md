Prérequis
Java JDK installé sur votre système
Maven (pour la construction du projet gRPC)
Git (pour cloner le référentiel)
Déploiement et Test
Cloner le référentiel depuis GitHub : git clone https://github.com/NadineAbedrabba/syst-mes-repartis
Compilation et exécution des serveurs et des clients :

Java RMI :cd JavaRMI
mvn clean package
java -jar target/JavaRMI-1.0.jar
gRPC : cd gRPC
mvn clean package
java -jar target/gRPC-1.0.jar
Sockets : cd Sockets
javac Server.java Client.java
java Server
java Client
