package _3_2.trafficlight;

public class Red  implements State
{
  public void next(TrafficLight trafficLight)
  {
    trafficLight.turnOn(Lights.RED);
    trafficLight.setState(new Yellow_Red());
  }

  @Override public LightColor getColor()
  {
    return LightColor.RED;
  }
}
