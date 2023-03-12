package _2_6;

import java.util.ArrayList;

public class Bar
{
  private ArrayList<Beer> beers;
  private static int MAX_BEERS = 20;

  public Bar()
  {
    beers = new ArrayList<>();
  }

  public synchronized void placeBeer(Beer b, String employeeName)
  {
    if (beers.size() < 20)
    {
      beers.add(b);
      System.out.println(employeeName + " places a beer");

    }
    else
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
  }

  public synchronized void takeBeer(String customerName)
  {
    if (beers.size() > 1)
    {
      beers.remove(beers.size() - 1);
      System.out.println(customerName + " takes a beer");

    }
    else
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
  }
}
