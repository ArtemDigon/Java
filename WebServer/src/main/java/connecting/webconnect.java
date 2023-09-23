package connecting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class webconnect {
        public static void main(String[] args) {
            try (ServerSocket serverSocket = new ServerSocket(80)){
                while(true) {
                    Socket socket = serverSocket.accept();
                    System.out.println("Client connected!");

                    BufferedReader input = new BufferedReader
                            (new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                    PrintWriter output = new PrintWriter(socket.getOutputStream());
                    while (!input.ready());

                    while (input.ready()) {
                        System.out.println(input.readLine());

                    }
                    output.println("HTTP/1.1 200 OK");
                    output.println("Content-Type: text/html; charset=utf-8");
                    output.println();
                    output.println("</h1> Привет от сервера! </h1>");
                    output.flush();

                    input.close();
                    output.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
