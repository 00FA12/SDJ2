package one_six;

public class Counter
{
  //critical resource 1
  private int count;
  //critical resource 2
  private int count2;

  private final Object lock1 = new Object();
  private final Object lock2 = new Object();
  public Counter()
  {
    count = 0;
  }
  public synchronized void incrementCount()
  {
    //critical region
    synchronized (lock1){
    count++;}
  }
  public void incrementCount2()
  {
    //critical region
    synchronized (lock2){
    count2++;}
  }
  public int getCount()
  {
    return count;
  }

  public int getCount2()
  {
    return count2;
  }
}
