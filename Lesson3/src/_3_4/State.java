package _3_4;

public interface State
{
  void call(Lift lift) throws InterruptedException;
  void selectFloor(Lift Lift);
}
