# UDP
Exercice3
Objectif de l’exercice : L'exercice consiste à créer localement un serveur UDP qui écoutera sur le port 1250 et qui pour chaque
Datagramme reçu et quelque soit leur contenu, retournera à l’émetteur un datagramme contenant la date et l’heure courante.
Côté serveur :
1.	Création du socket qui écoutera sur le port spécifié.
2.	Réception du datagramme
      +Création d’un paquet pour stocker les données reçues.
      +Réception du datagramme.
3.	Récupération de l’adresse et du port de l’émetteur :
      + Récupération de l’adresse IP de l’émetteur.
       + Récupération du port de l’émetteur.
4.	Obtention de la date et de l’heure courante : Création d’une instance de Date et conversion en chaine de caractères.
5.	Conversion de la date et l’heure en tableau d’octets.
6.	Création du datagramme à envoyer à l’émetteur.
7.	Envoi du datagramme contenant la date et l’heure courante à l’émetteur.
8.	Affichage de la réception et de l’envoi de datagramme (affichage de l’adresse IP et du port de l’émetteur et à qui la réponse est envoyée).
9.	Gestion des exceptions : en cas d’erreur d’entrée/sortie afficher la trace de la pile .


