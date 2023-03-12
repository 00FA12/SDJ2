package _3_1;

public class Phone
{
  private SpeakerState speakerState;
  public Phone()
  {
    this.speakerState = new Sound();
  }
  public void onClick()
  {
    speakerState.click(this);
  }
  public void onMessage(String message)
  {
    System.out.println(message);
    speakerState.alert(this);
  }
  protected void setState(SpeakerState state)
  {
    if (state != speakerState)
    {
      speakerState = state;
    }
  }
}
