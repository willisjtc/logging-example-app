package com.example.logging;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.net.NetServerOptions;
import io.vertx.core.net.NetSocket;

public class TcpServerVerticle extends AbstractVerticle {

  @Override
  public void start() {
    System.out.println("Starting tcp server verticle");
    vertx.createNetServer(new NetServerOptions().setLogActivity(true)).connectHandler(handler -> {
      NetSocket socket = handler.handler(buffer -> {
        System.out.println("buffer: " + buffer.toString());
      });
    }).listen(8082).onSuccess(netServer -> {
      System.out.println("Created the server");
    });
  }
}
