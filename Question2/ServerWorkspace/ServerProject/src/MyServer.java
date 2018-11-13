import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyServer {
  public static void main(String[] args){

    ServerSocket serverSocket = null;
    Scanner keyboard = new Scanner(System.in);
    try {
      serverSocket = new ServerSocket(16790);
      
      Socket clientSocket = null;
      System.out.println("Server is ready");
      clientSocket = serverSocket.accept();
      
    
      PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
      System.out.print("Enter a color blue or green:");
      
      String a = keyboard.nextLine();
      out.println(a);
      
      System.out.print("Enter a message:");
      String b = keyboard.nextLine();
      out.println(b);
      
      out.close();
      clientSocket.close();
      serverSocket.close();
    } catch (IOException e) {
      System.out.println("Error: " + e);
      System.exit(0);
    }
  }
}
