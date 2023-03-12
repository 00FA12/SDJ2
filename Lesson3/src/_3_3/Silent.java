package _3_3;

public class Silent implements SpeakerState
{

  @Override public void click(Phone phone)
  {
    phone.setState(new Sound());
  }

  @Override public void alert(Phone phone)
  {
    phone.setState(this);
  }

  @Override public void volumeUp(Phone phone)
  {

  }

  @Override public void volumeDown(Phone phone)
  {

  }
}
