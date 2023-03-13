package _7_2;

import java.io.IOException;

public interface ChatClient
{
 void send(String message);
 void close() throws IOException;
}
