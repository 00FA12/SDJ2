package _3_2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Car implements PropertyChangeListener
{
  private boolean isRunning;
  private final String license;

  public Car(String license) {
    this.license = license;
    this.isRunning = false;
  }

  public void start() {
    if (!isRunning) {
      System.out.println(license + " starting");
      isRunning = true;
    }
  }

  public void stop() {
    if (isRunning) {
      System.out.println(license + " stopping");
      isRunning = false;
    }
  }

  public void decelerate() {
    if (isRunning) {
      System.out.println(license + " decelerating");
    }
  }

  public void accelerate() {
    if (isRunning) {
      System.out.println(license + " accelerating");
    }
  }

  public boolean isRunning() {
    return isRunning;
  }

  public String getLicense() {
    return license;
  }

  @Override public void propertyChange(PropertyChangeEvent evt)
  {

  }
}
