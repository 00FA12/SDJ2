package _2_4;

public class BurgerBarCustomer implements Runnable
{
  private int burgersToEat;
  private String name;
  private BurgerBar burgerBar;
  public BurgerBarCustomer(String name, BurgerBar burgerBar, int burgersToEat)
  {
    this.burgerBar=burgerBar;
    this.name=name;
    this.burgersToEat=burgersToEat;
  }
  public void run()
  {
    for (int i = 0; i < burgersToEat; i++)
    {
      burgerBar.eatBurger(name);
      if (burgersToEat>1)
      {
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
}
