package Dsa22;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(3000);
            System.out.println("Server is running on port 3000!");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New Client connected!");
                OutputStream outputStream = clientSocket.getOutputStream();
                PrintWriter writer = new PrintWriter(outputStream, true);
                String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                Date dateWithoutFormat = new Date();
                writer.println("Date with format : " + date);
                writer.println("Date without format : " + dateWithoutFormat);
                clientSocket.close();
            }
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            try {
                serverSocket.close();
            } catch (Exception e) {
                System.out.println("Not Closed error");
            }
        }
    }
}
