package Tortoise;

public class Start
{
  public static void main(String[] args)
  {
    Manager manager = new Manager();
    Tortoise t = new Tortoise(manager);
    Hare h = new Hare(manager);
    Thread w = new Thread(t);
    Thread x = new Thread(h);
    x.start();
    w.start();
  }
}
