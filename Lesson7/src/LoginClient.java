import java.io.IOException;

public interface LoginClient
{
  boolean login(String username, String password);
  void close() throws IOException;
}
