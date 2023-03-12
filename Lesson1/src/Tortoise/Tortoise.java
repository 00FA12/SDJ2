package Tortoise;

public class Tortoise implements Runnable
{
  private Manager manager;
  public Tortoise(Manager manager)
  {
    this.manager = manager;
  }
  public void run()
  {
    while (!manager.finished())
    {
      manager.incrementTM();
      try
      {
        Thread.sleep(10);
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
    if (manager.getTm() == 1000)
    {
      System.out.println("Tortoise won");
      System.out.println(manager.getHm());
    }
  }
}
