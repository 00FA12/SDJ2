import javafx.scene.Scene;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class LoginCommunicator implements Runnable
{
  private final Socket socket;

  public LoginCommunicator(Socket socket)
  {
    this.socket = socket;
  }

  public void run()
  {
    try
    {
      InputStream inputStream = socket.getInputStream();
      BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
      OutputStream outputStream = socket.getOutputStream();
      PrintWriter writer = new PrintWriter(outputStream, true);
      String username = "";
      String password = "";
      loop : while (true)
      {
        String request = reader.readLine();

        switch (request)
        {
          case "connect":
          {
            writer.println("username");
            break;
          }
          case "username":
          {
            username = reader.readLine();
            writer.println("password");
            break;
          }
          case "password":
          {
            writer.println("password");
            password = reader.readLine();
            writer.println("approved");
            break;
          }
          case "approved":
          {
            writer.println("approved");
            writer.println("Welcome " + username + " your password is " + password);
            break;
          }
          case "exit":
            break loop;
        }
      }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        socket.close();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
  }
}
