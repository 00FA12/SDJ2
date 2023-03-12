package _2_6;

public class Start
{
  public static void main(String[] args)
  {
    Bar bar = new Bar();
    BarTender bt1 = new BarTender(bar, "Paco");
    BarTender bt2 = new BarTender(bar, "Andrés");
    Customer c1 = new Customer(bar, "Jose Luis");
    Customer c2 = new Customer(bar, "Antonia");
    Customer c3 = new Customer(bar, "Francisca");
    Customer c4 = new Customer(bar, "Miriam");
    Thread t1 = new Thread(bt1);
    Thread t2 = new Thread(bt2);
    Thread t3 = new Thread(c1);
    Thread t4 = new Thread(c2);
    Thread t5 = new Thread(c3);
    Thread t6 = new Thread(c4);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
  }
}
