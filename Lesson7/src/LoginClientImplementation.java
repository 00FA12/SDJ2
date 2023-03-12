import java.io.*;
import java.net.Socket;

public class LoginClientImplementation implements LoginClient
{
  private final Socket socket;
  private final PrintWriter writer;
  private final BufferedReader reader;

  public LoginClientImplementation(String host, int port) throws IOException
  {
    socket = new Socket(host, port);
    writer = new PrintWriter(socket.getOutputStream(), true);
    InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
    reader = new BufferedReader(inputStreamReader);
  }

  @Override public void close() throws IOException
  {
    writer.println("exit");
    socket.close();
  }
  public boolean login(String username, String password)
  {
    writer.println("connect");
    try
    {
      if (reader.readLine().equals("username"))
      {
        writer.println("username");
        writer.println(username);
        System.out.println(username);
      }
      else
      {
        throw new IllegalArgumentException("Program needs username");
      }

      if (reader.readLine().equals("password"))
      {
        writer.println(password);
        System.out.println(password);
      }
      else
      {
        throw new IllegalArgumentException("Program needs a password");
      }

//      if (!reader.readLine().equals("approved"))
//      {
//        throw new IllegalArgumentException("Program needs \"approved\" to continue");
//      }
    }
    catch (IOException e)
    {
      throw new IllegalArgumentException(e);
    }
    return true;
  }
}
