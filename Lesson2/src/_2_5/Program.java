package _2_5;

public class Program implements Runnable
{
  private String program;
  private String action;
  private int count;
  private static int RUNTIME = 100_000;

  public Program(String program, String action, int count)
  {
    this.program=program;
    this.action=action;
    this.count=count;
  }

  @Override public void run()
  {
    for (int i = 0; i < count; i++)
    {
     System.out.println(program + " wants to " + action);
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
