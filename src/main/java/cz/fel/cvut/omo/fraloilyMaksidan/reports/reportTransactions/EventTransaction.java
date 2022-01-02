package cz.fel.cvut.omo.fraloilyMaksidan.reports.reportTransactions;

import cz.fel.cvut.omo.fraloilyMaksidan.sensors.EventManager;
import cz.fel.cvut.omo.fraloilyMaksidan.sensors.Subscriber;

public class EventTransaction {
  private EventManager manager;
  private String event;
  private Subscriber user;

  public EventTransaction(EventManager manager, String event, Subscriber user) {
    this.manager = manager;
    this.event = event;
    this.user = user;
  }

  public EventManager getManager() {
    return manager;
  }

  public String getEvent() {
    return event;
  }

  public Subscriber getUser() {
    return user;
  }
}
