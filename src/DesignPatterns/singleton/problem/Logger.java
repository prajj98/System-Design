package DesignPatterns.singleton.problem;

import java.util.ArrayList;

public class Logger {

  private ArrayList<String> logs; // in-memory storage

  Logger() {
    this.logs = new ArrayList<>();
  }


  void log(String message) {
    this.logs.add(message);
    System.out.println(String.format("Logger: %s", message));
  }

  void printLogCount() {
    System.out.println(String.format("Logger: %s", this.logs.size()));
  }
}
