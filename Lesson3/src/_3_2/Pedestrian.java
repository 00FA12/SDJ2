package _3_2;

public class Pedestrian
{
  private boolean isWalking;
  private final String name;

  public Pedestrian(String name)
  {
    this.name = name;
    this.isWalking = false;
  }

  public void start()
  {
    if (!isWalking)
    {
      System.out.println(name + " begins to walk");
      isWalking = true;
    }
  }

  public void stop()
  {
    if (isWalking)
    {
      System.out.println(name + " decelerating");
      isWalking = false;
    }
  }

  public void decelerate()
  {
    if (isWalking)
    {
      System.out.println(name + " is decelerating");
    }
  }

  public void accelerate()
  {
    if (isWalking)
    {
      System.out.println(name + " is accelerating");
    }
  }
  public boolean isWalking()
  {
    return isWalking;
  }
  public String getName()
  {
    return name;
  }
}
