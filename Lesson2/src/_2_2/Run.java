package _2_2;

public class Run implements Runnable
{
  private ListContainer container;
  private int count;
  public Run(ListContainer container)
  {
    this.container=container;
  }
  public void run()
  {
    for (count = 0; count <100000 ; count++)
    {
      container.add(count);
      container.print(count);
    }

  }
}
