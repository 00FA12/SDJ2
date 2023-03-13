package _7_2;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ChatCommunicator implements Runnable
{
  private final Socket socket;
  private ArrayList<String> conversation;
  public ChatCommunicator(Socket socket)
  {
    this.socket = socket;
    conversation = new ArrayList<>();
  }

  @Override public void run()
  {
    try
    {
      InputStream inputStream = socket.getInputStream();
      BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
      OutputStream outputStream = socket.getOutputStream();
      PrintWriter writer = new PrintWriter(outputStream, true);
      loop: while (true)
      {
        String request = reader.readLine();

        switch (request)
        {
          case "send":
          {
            writer.println("giveMe");
          }
          case "toma":
          {
            String message = reader.readLine();
            conversation.add(message);
            if (!message.equals(""))
            {
              writer.println("done");
            }
          }
          case "close":
          {
            break loop;
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
