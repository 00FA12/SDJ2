package _3_2;

import _3_2.trafficlight.Lights;
import _3_2.trafficlight.TrafficLight;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class TaxiDriver implements PropertyChangeListener
{
  private final Car car;
  public TaxiDriver(Car car)
  {
    this.car = car;
  }
  public void onLightChange(TrafficLight trafficLight)
  {
    if (trafficLight.isTurnedOn(Lights.RED))
    {
      car.stop();
    }
    else
    {
      car.start();
      car.accelerate();
    }
  }
  public Car getCar()
  {
    return car;
  }

  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    TrafficLight light = (TrafficLight) evt.getSource();
    onLightChange(light);
  }
}
