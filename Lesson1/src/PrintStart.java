public class PrintStart
{
  public static void main(String[] args)
  {
    PrintNumbers pn = new PrintNumbers(70);
    Thread t = new Thread(pn);
    t.start();
  }
}
