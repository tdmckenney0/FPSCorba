import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

    // private ArrayList<Player> players;

    public static String decode(String str) {
        return new String(Base64.getDecoder().decode(str.getBytes()));
    }

    public static void main(String[] args) {

        // players = new ArrayList<Player>();

        try {

            String inline; 

            ServerSocket sock = new ServerSocket(5555);

            Socket clientSocket = sock.accept();

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            out.println("Welcome!");

            while ((inline = in.readLine()) != null) {
                out.println(inline);
                System.out.println(decode(inline));
            }


        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}