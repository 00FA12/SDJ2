package _3_2;

import _3_2.trafficlight.TrafficLight;

public class Start
{    public static void main(String[] args) throws InterruptedException {
  TrafficLight light = new TrafficLight();
  TrafficLightRunner runner = new TrafficLightRunner(light);
  Thread lightThread = new Thread(runner);
  lightThread.start();
  Car carA = new Car("A");
  Car carB = new Car("B");
  Car carC = new Car("C");
  Car carD = new Car("Taxii");
  Car carE = new Car("Dormilón");
  Driver driverA = new Driver(carA);
  Driver driverB = new Driver(carB);
  Driver driverC = new Driver(carC);
  TaxiDriver taxi = new TaxiDriver(carD);
  SleepyDriver sleepyDriver = new SleepyDriver(carE);
  carA.start();
  carB.start();
  carC.start();
  carD.start();
  carE.start();
  Thread.sleep(1000);
  light.addPropertyChangeListener(driverA);
  light.addPropertyChangeListener(driverB);
  Thread.sleep(2000);
  light.addPropertyChangeListener(driverC);
  light.addPropertyChangeListener(taxi);
  Thread.sleep(1000);
  light.addPropertyChangeListener(sleepyDriver);
}
}
