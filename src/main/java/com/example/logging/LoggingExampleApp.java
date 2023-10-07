package com.example.logging;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;

public class LoggingExampleApp {

  public static void main(String[] args) {
    System.out.println("starting logging example");
    Vertx vertx = Vertx.vertx();
    System.out.println("deploying verticles");
    vertx.deployVerticle(DeployVerticle.class, new DeploymentOptions());
  }
}
