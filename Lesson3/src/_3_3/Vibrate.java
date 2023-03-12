package _3_3;

public class Vibrate implements SpeakerState
{
  @Override public void click(Phone phone)
  {
    phone.setState(new Silent());
  }

  @Override public void alert(Phone phone)
  {
    System.out.println("BRRRR");
    phone.setState(this);
  }

  @Override public void volumeUp(Phone phone)
  {

  }

  @Override public void volumeDown(Phone phone)
  {

  }
}
