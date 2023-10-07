package com.example.logging;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.net.NetSocket;

public class TcpClientVerticle extends AbstractVerticle {

  @Override
  public void start() {
    System.out.println("Starting tcp client verticle");
    vertx.createNetClient().connect(8082, "localhost", connectionHandler -> {
      if (connectionHandler.succeeded()) {
        System.out.println("Client connection created");
        NetSocket socket = connectionHandler.result();
        socket.write("Hello there, server!");
      }
    });
  }
}
