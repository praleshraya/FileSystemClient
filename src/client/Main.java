package client;

import java.io.*;

import java.net.*;

public class Main {
//        private static final String SERVER_IP = "127.0.0.1";
    private static final String SERVER_IP = "172.174.237.106";

    private static final int SERVER_PORT = 6789;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_IP, SERVER_PORT);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to server");
            System.out.println("Enter Commands:");
            String userInput;

            while ((userInput = stdIn.readLine()) != null) {

                out.println(userInput);
                if (userInput.equals("QUIT")) {
                    break;
                }
                if(userInput.startsWith("WRITE"))
                {
                    String dataInput;
                  while (!(dataInput= stdIn.readLine()).equals("END"))
                  {
                      out.println(dataInput);
                  }
                  out.println("END");
                }
                System.out.println("Server says:");
                String response;
                while (!(response = in.readLine()).equals("END")) {
                    System.out.println(response);

                }
            }
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + SERVER_IP);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                    SERVER_IP);
            System.exit(1);
        }
    }
}
