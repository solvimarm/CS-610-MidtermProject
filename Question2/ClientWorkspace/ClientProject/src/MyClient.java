import java.applet.Applet;
import java.awt.*;
import java.io.*;
import java.net.*;

public class MyClient extends Applet {
 
  private String color;
  private String message;

  public void init(){
    setSize(400, 400);
    try{
      InetAddress host = InetAddress.getByName("localhost");
      Socket clientSocket = new Socket(host, 16790);

      BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
      color = in.readLine();
      
    
      if (color.equalsIgnoreCase("blue")) {
    	  setBackground(Color.BLUE);
      }
      else if (color.equalsIgnoreCase("green")) {
    	  setBackground(Color.GREEN);
      }
    
      message = in.readLine();
      
    }catch(Exception e){
      //System.out.println("Error: " + e);
      e.printStackTrace();
      System.exit(0);
    }
  }

  public void paint(Graphics page){
  
    page.drawString(message, 20, 200);
  }
}
