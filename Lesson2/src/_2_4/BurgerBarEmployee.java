package _2_4;

public class BurgerBarEmployee implements Runnable
{
  private String name;
  private BurgerBar burgerBar;
  public BurgerBarEmployee(String name, BurgerBar burgerBar)
  {
    this.name=name;
    this.burgerBar=burgerBar;
  }
  public void run()
  {
    for (int i = 1; i > -1; i=1)
    {
      burgerBar.makeBurger(name);
      try
      {
        Thread.sleep(2000);
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
  }
}
