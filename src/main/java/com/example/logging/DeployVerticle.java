package com.example.logging;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;

public class DeployVerticle extends AbstractVerticle {

  @Override
  public void start() {
    System.out.println("deploying tcp server verticle");
    vertx.deployVerticle(TcpServerVerticle.class, new DeploymentOptions());
    System.out.println("deploying tcp client verticle");
    vertx.deployVerticle(TcpClientVerticle.class, new DeploymentOptions());
  }

}
