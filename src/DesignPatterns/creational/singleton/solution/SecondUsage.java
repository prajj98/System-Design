package DesignPatterns.creational.singleton.solution;

import static DesignPatterns.creational.singleton.solution.Logger.getLogger;

public class SecondUsage {

  private Logger logger;

  public SecondUsage() {
    this.logger = getLogger();
  }

  void use() {
    System.out.println("Logger instance hashcode is: " + logger.hashCode());
    logger.printLogCount();
    logger.log("Second Log");
    logger.printLogCount();
  }
}
