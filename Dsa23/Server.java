package Dsa23;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket ss = null;
        try {
            ss = new ServerSocket(3000);
            System.out.println("Server is running on Port 3000!");
            Socket clientSocket = ss.accept();
            System.out.println("New Client Connected!");
            InputStream input = clientSocket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            OutputStream output = clientSocket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            while (true) {

                String clientMessage = reader.readLine();

                if (clientMessage.equals("Exit")) {
                    System.out.println("Connection closed!");
                    break;
                }

                System.out.println("Client message : " + clientMessage);

                String reverseMsg = new StringBuilder(clientMessage).reverse().toString();

                writer.println("Reverse Message : " + reverseMsg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ss.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
