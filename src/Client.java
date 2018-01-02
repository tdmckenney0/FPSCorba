import java.io.*;
import java.net.*;
import java.util.*;

public class Client {

    public static String encode(String str) {

        // RegEx for CSV ---->  \\s*,\\s*

        return new String(Base64.getEncoder().encode(str.getBytes()));
    }

    public static void main(String[] args) {

        try {

            Socket sock = new Socket("localhost", 5555);

            PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));

            BufferedReader linein = new BufferedReader(new InputStreamReader(System.in));

            String fromUser, toServer;

            while((fromUser = linein.readLine()) != null) {
                /* System.out.println("Server: " + fromServer);
                if (fromServer.equals("Bye."))
                    break;

                fromUser = stdIn.readLine();
                if (fromUser != null) {
                    System.out.println("Client: " + fromUser);
                    out.println(fromUser);
                } */

                toServer = encode(fromUser);

                System.out.println(toServer);

                out.println(toServer);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}