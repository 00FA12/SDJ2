package _2_5;

public class Mailbox implements Runnable
{
  private int count;
  private static int RUNTIME = 100_000;
  public Mailbox(int count)
  {
    this.count=count;
  }
  public void run()
  {
    for (int i = 0; i <count; i++)
    {
    System.out.println("New mail in your mailbox...");
      try
      {
        Thread.sleep(RUNTIME/count);
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
  }
}
