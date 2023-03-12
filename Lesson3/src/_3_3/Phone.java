package _3_3;

public class Phone
{
  private SpeakerState state;
  private int volume;

  public void onClick()
  {
    state.click(this);
  }

  public void onMessage(String message)
  {
    System.out.println(message);
    state.alert(this);
  }

  public void onVolumeUp()
  {
    if (getVolume() < 10 && state instanceof Sound)
    {
      state.volumeUp(this);
    }
  }

  public void onVolumeDown()
  {
    if (getVolume() > 0 && state instanceof Sound)
    {
      state.volumeDown(this);
    }
  }

  protected int getVolume()
  {
    return volume;
  }

  protected void setVolume(int volume)
  {
    this.volume = volume;
  }

  protected void setState(SpeakerState state)
  {
    this.state = state;
  }
}
