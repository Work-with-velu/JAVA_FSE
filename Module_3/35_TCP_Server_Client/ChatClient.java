package TCP_Server_Client
import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String userInput;
        while ((userInput = input.readLine()) != null) {
            out.println(userInput);
        }

        socket.close();
    }
}
