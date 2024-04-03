package com.example.simplerestapi;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/ping")
public class PingResource {

  @GET
  @Produces("text/plain")
  public String ping() {
    return "Pong!";
  }
}
