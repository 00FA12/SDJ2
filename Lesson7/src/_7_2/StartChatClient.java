package _7_2;

import java.io.IOException;

public class StartChatClient
{
  public static void main(String[] args) throws IOException
  {
    ChatClient client = new ChatClientImplementation("localhost", 8888);
    client.send("test");
    client.send("test2");
//    client.send("t'imaginas que funciona?");
    client.close();
  }
}
