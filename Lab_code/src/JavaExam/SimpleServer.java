package JavaExam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9999);
            System.out.println("Server started");
            System.out.println("Server waiting for client connection requests");

            //while (true) {
                try {
                    // Accept client connection
                    Socket socket = server.accept();
                    System.out.println("Client request accepted");

                    // Create streams for communication
                    DataInputStream in = new DataInputStream(socket.getInputStream());
                    DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                    // Read client message and respond
                    String clientMessage = in.readUTF();
                    System.out.println("Received from client: " + clientMessage);
                    out.writeUTF("Echo from server: " + clientMessage);

                    // Close client connection
                    in.close();
                    out.close();
                    socket.close();
                } catch (Exception e) {
                    System.out.println("Error handling client: " + e.getMessage());
                }
            //}
        } catch (Exception e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
