package Tortoise;

import java.util.Random;

public class Hare implements Runnable
{
  private Manager manager;
  public Hare(Manager manager)
  {
    this.manager=manager;
  }
  public void run()
  {
    while (!manager.finished())
    {
      if (manager.getTm() >= manager.getHm())
      {
      manager.incrementHM();
      }
      Random r = new Random();
      int i = r.nextInt(1000);
      try
      {
        Thread.sleep(i);
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
    if (manager.getHm() == 1000)
    {
      System.out.println("Hare won");
      System.out.println(manager.getTm());
    }
  }
}
