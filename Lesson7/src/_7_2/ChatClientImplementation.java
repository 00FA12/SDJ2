package _7_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClientImplementation implements ChatClient
{
  @Override public void close() throws IOException
  {
    writer.println("close");
    socket.close();
  }

  private final Socket socket;
  private final PrintWriter writer;
  private final BufferedReader reader;
  public ChatClientImplementation(String host, int port) throws IOException
  {
    socket = new Socket(host, port);
    writer = new PrintWriter(socket.getOutputStream(), true);
    InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
    reader = new BufferedReader(inputStreamReader);
  }
  public void send(String message)
  {
    writer.println("send");
    try
    {
    if (reader.readLine().equals("giveMe"))
    {
      writer.println("toma");
      writer.println(message);
    }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

    try
    {
    if (reader.readLine().equals("done"))
    {
      System.out.println(message);
    }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
