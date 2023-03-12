package _2_6;

public class Customer implements Runnable
{
  private Bar bar;
  private String name;

  public Customer(Bar bar, String name)
  {
    this.bar= bar;
    this.name=name;
  }

  @Override public void run()
  {
    for (int i = 1; i > -1; i=1)
    {
      bar.takeBeer(name);
      try
      {
        Thread.sleep(10000);
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
  }
}
