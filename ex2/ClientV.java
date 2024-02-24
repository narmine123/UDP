
import java.io.*;
import java.net.*;

public class ClientV {
    public static void main(String[] args) {
        try {
            // Adresse IP et port du serveur
            InetAddress serveurAdresse = InetAddress.getByName("localhost");
            int port = 12345;

            // Création du socket
            DatagramSocket socket = new DatagramSocket();

            // Création de l'objet voiture
            voiture voitureObj = new voiture("Type", "Model");

            // Envoi de l'objet voiture au serveur

            ByteArrayOutputStream baos = new ByteArrayOutputStream();// Cette ligne crée un flux de sortie
                                                                     // (OutputStream) dans la mémoire, représenté par
                                                                     // un tableau d'octets.
            // Cela signifie que tout ce qui est écrit dans ce flux de sortie sera stocké en
            // mémoire dans un tableau d'octets.
            ObjectOutputStream oos = new ObjectOutputStream(baos);// Cette ligne crée un ObjectOutputStream qui est
                                                                  // utilisé pour écrire des objets Java sérialisés dans
                                                                  // un flux d'octets.
            // Cela signifie que tout objet Java sérialisé que nous écrivons dans oos sera
            // stocké dans le ByteArrayOutputStream.

            oos.writeObject(voitureObj);

            byte[] data = baos.toByteArray();// Cette ligne attribue le tableau d'octets retourné par toByteArray() à la
                                             // variable data
            DatagramPacket packet = new DatagramPacket(data, data.length, serveurAdresse, port);

            socket.send(packet);

            // Fermeture du socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
