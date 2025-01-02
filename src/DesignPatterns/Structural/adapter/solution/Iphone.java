package DesignPatterns.Structural.adapter.solution;

public class Iphone {

  private AppleCharger appleCharger;

  public Iphone(AppleCharger appleCharger) {
    this.appleCharger = appleCharger;
  }

  public void charge() {
    appleCharger.charge();
  }
}
