package _3_2.trafficlight;

public interface State
{
   void next(TrafficLight trafficLight);
   LightColor getColor();
}
