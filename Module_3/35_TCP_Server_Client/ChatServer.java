package TCP_Server_Client;
import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started. Waiting for client...");
        Socket clientSocket = serverSocket.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        out.println("Welcome to the server!");

        String message;
        while ((message = in.readLine()) != null) {
            System.out.println("Client: " + message);
        }

        clientSocket.close();
        serverSocket.close();
    }
}
