package _2_3;

import static java.lang.Thread.sleep;

public class Thermometer implements Runnable
{
  private String id;
  private double t;
  private int d;
  public Thermometer(String id, double t, int d)
  {
    this.id=id;
    this.t=t;
    this.d=d;
  }
  private double temperature(double t, int p, int d, double t0, int s)
  {
    double tMax = Math.min(11 * p + 10, 11 * p + 10 + t0);
    tMax = Math.max(Math.max(t, tMax), t0);
    double heaterTerm = 0;
    if (p > 0)
    {
      double den = Math.max((tMax * (20 - 5 * p) * (d + 5)), 0.1);
      heaterTerm = 30 * s * Math.abs(tMax - t) / den;
    }
    double outdoorTerm = (t - t0) * s / 250.0;
    t = Math.min(Math.max(t - outdoorTerm + heaterTerm, t0), tMax);
    return t;
  }
  public void run()
  {
    for (int i = 0; i >- 1; i=0)
    {
      t = temperature(t, 2, d, 0, 6);
      System.out.println(t + " " + id);
      try
      {
        Thread.sleep(6000);
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
  }
}
