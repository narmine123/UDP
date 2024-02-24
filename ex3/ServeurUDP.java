package ex3;

import java.io.*;
import java.net.*;
import java.util.Date;

public class ServeurUDP {
    public static void main(String[] args) {
        try {
            // Port d'écoute
            int port = 1250;

            // Création du socket
            DatagramSocket socket = new DatagramSocket(port);
            System.out.println("Serveur UDP démarré. En attente de datagrammes...");

            while (true) {
                // Buffer pour recevoir les données
                byte[] buffer = new byte[1024];

                // Réception du datagramme
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);

                // Récupération de l'adresse et du port de l'émetteur
                InetAddress adresseClient = packet.getAddress();
                int portClient = packet.getPort();

                // Obtention de la date et de l'heure courante
                String dateHeure = new Date().toString();

                // Conversion de la date et de l'heure en tableau d'octets
                byte[] dateHeureBytes = dateHeure.getBytes();

                // Création du datagramme à envoyer à l'émetteur
                DatagramPacket packetReponse = new DatagramPacket(dateHeureBytes, dateHeureBytes.length, adresseClient, portClient);

                // Envoi du datagramme contenant la date et l'heure courante à l'émetteur
                socket.send(packetReponse);

                // Affichage de la réception et de l'envoi de datagramme
                System.out.println("Datagramme reçu de " + adresseClient + ":" + portClient);
                System.out.println("Réponse envoyée à " + adresseClient + ":" + portClient);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
