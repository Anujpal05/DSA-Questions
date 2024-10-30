package Dsa23;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Client
 */
public class Client {
    public static void main(String[] args) {
        Socket client = null;
        try {
            client = new Socket("localhost", 3000);
            System.out.println("Connection Establish successfully!");
            Scanner sc = new Scanner(System.in);
            InputStream input = client.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            OutputStream output = client.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            while (true) {
                System.out.println("Enter a new Message :");
                String str = sc.nextLine();

                writer.println(str);

                if (str.equals("Exit")) {
                    System.out.println("Connection closed!");
                    break;
                }
                String reverseStr = reader.readLine();

                System.out.println("Reverse String is : " + reverseStr);
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (client != null) {
                    client.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}