public class PrintNumbers implements Runnable
{
  private int howMany;
  public PrintNumbers(int howMany)
  {
    this.howMany=howMany;
  }
  public void run()
  {
    for (int i = 0; i <= howMany; i++)
    {
      System.out.println(i);
      try
      {
        Thread.sleep(1000);
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
  }
}
