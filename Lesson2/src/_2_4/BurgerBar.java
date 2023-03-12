package _2_4;

public class BurgerBar
{
  private int numberOfBurgers;
  private int maxNumberOfBurgers;
  public BurgerBar(int maxNumberOfBurgers)
  {
    this.maxNumberOfBurgers=maxNumberOfBurgers;
    numberOfBurgers=0;
  }
  public synchronized void makeBurger(String employeeName)
  {
    while (numberOfBurgers>=maxNumberOfBurgers)
    {
      try
      {
        wait();
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
    System.out.println(employeeName);
    numberOfBurgers++;
    notify();
  }
  public synchronized void eatBurger(String who)
  {
    while(numberOfBurgers<=0)
    {
      try
      {
        wait();
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
    System.out.println(who);
    numberOfBurgers++;
    notify();
  }
  public int getNumberOfBurgers()
  {
    return numberOfBurgers;
  }
}
