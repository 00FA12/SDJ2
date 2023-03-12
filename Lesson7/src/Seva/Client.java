package Seva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;

public class Client
{
  public static void main(String[] args) throws IOException
  {
    try
    {
      Socket socket = new Socket("localhost", 5678);

      BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

      BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in)); // for console reading


      String inputVal;
      writer.println("connect");
      String response = reader.readLine();

      if (response.equals("Disconnected"))
      {
        socket.close();
        return;
      }


      while(true)
      {
        if(!reader.readLine().equals("Username?"))
        {
          break;
        }
        System.out.println("Enter a username: ");
        inputVal = stdIn.readLine();
        writer.println(inputVal);

        if(!reader.readLine().equals("Password?"))
        {

          break;
        }
        System.out.println("Enter a password: ");
        inputVal = stdIn.readLine();
        writer.println(inputVal);
        System.out.println(reader.readLine() + "\n\n");
        Thread.sleep(2000);
      }
      socket.close();
    }
    catch (IOException | InterruptedException e)
    {
      e.printStackTrace();
    }
  }
}