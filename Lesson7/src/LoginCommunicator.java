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
      PrintWriter writer = new PrintWriter(outputStream);

      while (true)
      {
        String request = reader.readLine();
        String username = "";
        String password = "";
        switch (request)
        {
          case "connect":
          {
            writer.println("username");
          }
          case "username":
          {
            username = reader.readLine();
            writer.println("password");
          }
          case "password":
          {
            password = reader.readLine();
            writer.println("approved");
          }
          case "approved":
          {
            writer.println(
                "Welcome " + username + " your password is " + password);
          }
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
