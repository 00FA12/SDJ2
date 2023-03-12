import java.io.IOException;

public class StartLoginClient
{
  public static void main(String[] args) throws IOException
  {
    LoginClient client = new LoginClientImplementation("localhost", 8888);
    client.login("Paco", "12345");
    client.close();
  }
}
