package _2_2;

public class Start
{

  public static void main(String[] args)
  {
    ListContainer l1 = new ListContainer();
    Run run1 = new Run(l1);
    Run run2 = new Run(l1);
    Thread t = new Thread(run1);
    Thread w = new Thread(run2);
    t.start();
    w.start();
  }
}
