
import java.io.*;
import java.net.*;

public class ServeurV {
    public static void main(String[] args) {
        try {
            // Port d'écoute
            int port = 12345;

            // Création du socket
            DatagramSocket socket = new DatagramSocket(port);

            // Buffer pour recevoir les données
            byte[] buffer = new byte[1024];

            // Réception de l'objet voiture
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);

            // Conversion des données reçues en objet voiture
            ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
            ObjectInputStream ois = new ObjectInputStream(bais);

            voiture voitureObj = (voiture) ois.readObject();

            // Traitement de l'objet voiture (par exemple, fixer une quantité de carburant)
            voitureObj.setCarburant(50);

            // Fermeture du socket
            socket.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
