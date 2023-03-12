package _3_2;

import _3_2.trafficlight.TrafficLight;

public class TrafficLightRunner implements Runnable
{
  private TrafficLight trafficLight;

  public TrafficLightRunner(TrafficLight trafficLight) {
    this.trafficLight = trafficLight;
  }

  public void run() {
    try {
      while(true) {
        Thread.sleep(1000);
        trafficLight.next();
      }
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
