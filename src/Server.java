import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

    // Singleton //

    public static Server instance = null; 

    // Our Players //

    private ArrayList<Player> players;

    // Server-side Entry Point //

    public static void main(String[] args) {
        try {
            instance = new Server(Integer.parseInt(args[0])); 
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // Constructor //

    public Server(int port) throws Exception {
        players = new ArrayList<Player>();

        String inline; 

        ServerSocket sock = new ServerSocket(port);

        Socket clientSocket = sock.accept();

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        out.println("Welcome!");

        while ((inline = in.readLine()) != null) {
            out.println(inline);
            System.out.println(decode(inline));
        }
    }

    public static String decode(String str) {
        return new String(Base64.getDecoder().decode(str.getBytes()));
    }
}