# UDP
Exercice2
Objectif de l’exercice : L'exercice consiste à échanger des objets de la classe Voiture entre le client et le serveur via les sockets. Le client crée un objet Voiture, ajuste la quantité de carburant à l'aide de la méthode setCarburant(), puis envoie cet objet au serveur. Le serveur peut ensuite manipuler l'objet Voiture.
Classe Voiture:
La classe Voiture représente une entité voiture avec des propriétés telles que le carburant, le modèle et le type.
Les méthodes :
•	voiture(String _type, String _model): Constructeur de la classe permettant d'initialiser les propriétés.
•	setCarburant(int c): Méthode pour fixer la quantité de carburant de la voiture.
•	getCarburant(): Méthode pour obtenir la quantité actuelle de carburant.
•	getCapacite(): Méthode pour obtenir la capacité maximale du réservoir de carburant.
Les propriétés :
  Carburant/model/type/capacite

Côté serveur:
1.	Création du socket 
2.	Création du Buffer pour recevoir les données.
3.	Réception de l’objet voiture :
      +Création d’un paquet pour stocker les données reçues.
      +Réception du paquet envoyé par le client.
4.	Conversion des données reçues en objet voiture :
      +Création d’un flux d’entrée à partir des données reçues.
      +Création d’un flux d’entrée pour la désérialisation.
      +Désérialisation de l’objet voiture à partir du flux d’entrée.
5.	Traitement de l'objet Voiture.
6.	Fermeture de socket après la réception et le traitement de l’objet voiture.
7.	Gestion des exceptions : en cas d’erreur d’entrée/sortie ou de classe non trouvée.
Côté client :
1.	Adresse IP et port du serveur :  
       +Résolution de l’adresse IP du serveur (dans ce cas, localhost).
      +Définition du port sur lequel le serveur écoute.
2.	Création du socket 
3.	Création de l'objet Voiture : Une instance de la classe voiture est créée avec les informations nécessaires(un type et un modèle spécifié).
4.	Envoi de l'objet au serveur :
    +Création d’un flux de sortie pour stocker les données de l’objet sérialisé.
     +Crée d’un flux d’objets de sortie pour écrire l’objet voiture sérialisé.
     +Ecriture de l’objet voiture dans le flux d’objets de sortie.
     +Conversion du flux d’octets dans un tableau d’octets.
     +Création d’un paquet à envoyer au serveur avec les données de l’objet sérialisé.
      +Envoi du paquet au serveur.
5.	Fermeture du socket après l’envoi du paquet.
6.	Gestion des exceptions : en cas d’erreur d’entrée/sortie .




