package one_six;

public class Start
{
  public static void main(String[] args) throws InterruptedException
  {
    Counter counter = new Counter();
    CounterIncrementer counterIncrementer = new CounterIncrementer(counter);
    CounterIncrementer counterIncrementer1 = new CounterIncrementer(counter);
    Thread t = new Thread(counterIncrementer);
    Thread w = new Thread(counterIncrementer1);
    t.start();
    w.start();
  }
}
