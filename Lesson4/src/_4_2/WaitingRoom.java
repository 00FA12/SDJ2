package _4_2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WaitingRoom implements Runnable
{
  private PropertyChangeSupport support;
  private int currentTicketNumber;
  public void addPropertyChangeListener(PropertyChangeListener listener)
  {
    currentTicketNumber=0;
    support.addPropertyChangeListener(listener);
  }
  public void removePropertyChangeListener(PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(listener);
  }
  public void run()
  {
    while (currentTicketNumber < 5)
    {
      int previusTicket = currentTicketNumber;
      currentTicketNumber++;
      System.out.println("Ding!");
      support.firePropertyChange("ticketNumber", previusTicket, currentTicketNumber);
      try
      {
        Thread.sleep(1000);
      }
      catch (InterruptedException e)
      {}
    }
  }
}
