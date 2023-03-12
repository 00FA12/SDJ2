package _3_4;

public class Stopped implements State
{
  @Override public void call(Lift lift) throws InterruptedException
  {
    lift.onCall(lift);
  }

  @Override public void selectFloor(Lift Lift)
  {

  }
}
