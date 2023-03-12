package _3_1;

public class Sound implements SpeakerState
{
  public Sound()
  {}
  public void click(Phone phone)
  {
    phone.setState(new Vibrate());
  }
  public void alert(Phone phone)
  {
    System.out.println("DRRRING");
    phone.setState(this);
  }
}
