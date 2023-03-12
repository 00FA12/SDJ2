package _2_3;

public class Pium
{
  public static void main(String[] args)
  {
    Thermometer t2 = new Thermometer("t1", 15, 1);
    Thermometer t1 = new Thermometer("t2", 15, 7);
    Thread t = new Thread(t2);
    Thread w = new Thread(t1);
    w.start();
    t.start();
  }
}
