package DesignPatterns.abstractfactory.solution;

public class MacButton implements Button {

  @Override
  public void paint() {
    System.out.println("You have created MacOs Button");
  }
}
