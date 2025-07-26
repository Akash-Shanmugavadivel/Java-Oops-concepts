package JavaExam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClient {
    public static void main(String[] args) {
        try {
            // Establish connection to the server
            Socket socket = new Socket("localhost", 9999);
            System.out.println("Connected to server");

            // Create streams for communication
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            // Read input from the user
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a message to send to the server: ");
            String clientMessage = input.nextLine();

            // Send message to server
            out.writeUTF(clientMessage);
            out.flush();

            // Read response from server
            String serverResponse = in.readUTF();
            System.out.println("Response from server: " + serverResponse);

            // Close resources
            input.close();
            in.close();
            out.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
