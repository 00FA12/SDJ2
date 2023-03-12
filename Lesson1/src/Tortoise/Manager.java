package Tortoise;

public class Manager
{
  private int tm;
  private int hm;
  public Manager()
  {
    tm = 0;
    hm = 0;
  }
  public void incrementTM()
  {
    tm++;
  }
  public void incrementHM()
  {
    hm = hm + 50;
  }
  public boolean finished()
  {
    return tm == 1000 || hm == 1000;
  }
  public int getTm()
  {
    return tm;
  }
  public int getHm()
  {
    return hm;
  }
}
