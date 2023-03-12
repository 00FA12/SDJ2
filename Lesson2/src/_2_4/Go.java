package _2_4;

public class Go
{
  public static void main(String[] args)
  {
    BurgerBar bb = new BurgerBar(10);
    BurgerBarEmployee b1 = new BurgerBarEmployee("Paco", bb);
    BurgerBarEmployee b2 = new BurgerBarEmployee("Abe", bb);
    BurgerBarCustomer bc1 = new BurgerBarCustomer("Andrés", bb, 2);
    BurgerBarCustomer bc2 = new BurgerBarCustomer("José", bb, 1);
    BurgerBarCustomer bc3 = new BurgerBarCustomer("Francisca", bb, 4);
    BurgerBarCustomer bc4 = new BurgerBarCustomer("Antonia", bb, 3);
    BurgerBarCustomer bc5 = new BurgerBarCustomer("María", bb, 1);

    Thread t1 = new Thread(b1);
    Thread t2 = new Thread(b2);
    Thread t3 = new Thread(bc1);
    Thread t4 = new Thread(bc2);
    Thread t5 = new Thread(bc3);
    Thread t6 = new Thread(bc4);
    Thread t7 = new Thread(bc5);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
    t7.start();
  }
}
