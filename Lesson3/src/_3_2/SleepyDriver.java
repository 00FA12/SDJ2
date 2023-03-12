package _3_2;

import _3_2.trafficlight.Lights;
import _3_2.trafficlight.TrafficLight;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class SleepyDriver implements PropertyChangeListener
{
  private final Car car;
  public SleepyDriver(Car car)
  {
    this.car = car;
  }
  public void onLightChange(TrafficLight trafficLight)
  {
    if (trafficLight.isTurnedOn(Lights.GREEN))
    {
      if (!car.isRunning())
      {
        car.start();
      }
      car.accelerate();
      trafficLight.removePropertyChangeListener(this);
    }

    else if (trafficLight.isTurnedOn(Lights.YELLOW) && !trafficLight.isTurnedOn(Lights.RED))
    {
      car.decelerate();
    }
    else car.stop();
  }
  public Car getCar() {
    return car;
  }

  @Override
  public void propertyChange(PropertyChangeEvent evt) {
    TrafficLight light = (TrafficLight) evt.getSource();
    onLightChange(light);
  }
}
