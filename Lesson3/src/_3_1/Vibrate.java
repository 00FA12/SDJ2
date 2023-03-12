package _3_1;

public class Vibrate implements SpeakerState
{
  public Vibrate()
  {}
  public void click(Phone phone)
  {
    phone.setState(new Silent());
  }
  public void alert(Phone phone)
  {
    System.out.println("BRRRR");
    phone.setState(this);
  }
}
