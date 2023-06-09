package _3_3;


public class Sound implements SpeakerState
{
  @Override public void click(Phone phone)
  {
    phone.setState(new Vibrate());
  }

  @Override public void alert(Phone phone)
  {
    System.out.println("DRRRING");
    phone.setState(this);
  }

  @Override public void volumeUp(Phone phone)
  {
    if (phone.getVolume() < 10)
    {
      phone.setVolume(phone.getVolume()+1);
    }
  }

  @Override public void volumeDown(Phone phone)
  {
    if (phone.getVolume() == 1)
    {
      phone.setVolume(0);
      phone.setState(new Vibrate());
    }
    else
    {
      phone.setVolume(phone.getVolume()-1);
    }
  }
}
