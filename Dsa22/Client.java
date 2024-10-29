package Dsa22;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket("localhost", 3000);
            System.out.println("You are connected to " + socket.getInetAddress().getHostAddress() + " at Port "
                    + socket.getPort());
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String clientMessage = reader.readLine();
            System.out.println("Server response : " + clientMessage);
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            try {
                socket.close();
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}
