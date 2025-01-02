package DesignPatterns.creational.factory.solution;

public class WebDeveloper implements Employee {

  @Override
  public int salary() {
    return 200000;
  }

  @Override
  public String name() {
    return "Web Developer";
  }
}
