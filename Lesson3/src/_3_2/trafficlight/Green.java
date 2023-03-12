package _3_2.trafficlight;

public class Green implements State
{
  @Override public void next(TrafficLight trafficLight)
  {
    trafficLight.turnOff(Lights.GREEN);
    trafficLight.turnOn(Lights.YELLOW);
    trafficLight.setState(new Yellow());
  }

  @Override public LightColor getColor()
  {
    return LightColor.GREEN;
  }
}
