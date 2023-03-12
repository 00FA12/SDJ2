package _3_1;

public class Silent implements SpeakerState
{
  public Silent()
  {}
  public void click(Phone phone)
  {
    phone.setState(new Sound());
  }
  public void alert(Phone phone)
  {
    phone.setState(this);
  }
}
