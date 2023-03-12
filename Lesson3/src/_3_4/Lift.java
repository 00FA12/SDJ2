package _3_4;

public class Lift
{
  private State state;
  private int callFloor;
  private int actualFloor;

  public void onCall(Lift lift) throws InterruptedException
  {
    if (getActualFloor()!=getCallFloor())
    {
      while (getCallFloor() != getActualFloor())
      {
        if (getCallFloor()>getActualFloor())
        {
          Thread.sleep(2000);
          setActualFloor(getActualFloor() + 1);
        }
        else
        {
          Thread.sleep(1500);
          setActualFloor(getActualFloor() - 1);
        }
      }
    }
  }

  protected int getCallFloor()
  {
    return callFloor;
  }

  protected int getActualFloor()
  {
    return actualFloor;
  }

  protected void setActualFloor(int actualFloor)
  {
    this.actualFloor = actualFloor;
  }

  protected void setCallFloor(int callFloor)
  {
    this.callFloor=callFloor;
  }
}
