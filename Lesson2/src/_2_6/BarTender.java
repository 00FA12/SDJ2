package _2_6;

public class BarTender implements Runnable
{
  private Bar bar;
  private String name;
  public BarTender(Bar bar, String name)
  {
    this.bar = bar;
    this.name=name;
  }
  public void run()
  {
    for (int i = 1; i > -1; i=1)
    {
      bar.placeBeer(new Beer(), name);
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
