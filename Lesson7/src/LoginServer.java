import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("Starting sever");

    try (ServerSocket serverSocket = new ServerSocket(8888))
    {
      while (true)
      {
        System.out.println("Waiting for connection on " + serverSocket.getLocalPort());
        Socket socket = serverSocket.accept();
        System.out.println("Client connected");
        LoginCommunicator communicator = new LoginCommunicator(socket);
        Thread thread = new Thread(communicator);
        thread.start();
      }
    }

  }
}
