package _3_2.trafficlight;

public class Yellow implements State
{
  @Override public void next(TrafficLight trafficLight)
  {
    trafficLight.turnOn(Lights.RED);
    trafficLight.turnOff(Lights.YELLOW);
    trafficLight.setState(new Red());
  }

  @Override public LightColor getColor()
  {
    return LightColor.YELLOW;
  }
}
