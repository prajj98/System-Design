package DesignPatterns.creational.singleton.solution;


import static DesignPatterns.creational.singleton.solution.Logger.getLogger;

public class FirstUsage {

  private Logger logger;

  public FirstUsage() {
    this.logger = getLogger();
  }

  void use() {
    System.out.println("Logger instance hashcode is: " + logger.hashCode());
    logger.printLogCount();
    logger.log("First Log");
    logger.printLogCount();
  }
}
