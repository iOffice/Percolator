package com.Percolator.cronofy.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URI;


public class CronofyUserAuthorizationTokenRequest {
  @JsonProperty("email")
  private final String email;
  @JsonProperty("callback_url")
  private final URI callbackURI;
  @JsonProperty("scope")
  private final String scope;

  CronofyUserAuthorizationTokenRequest(String email, URI callbackURI, String scope) {
    this.email = email;
    this.callbackURI = callbackURI;
    this.scope = scope;
  }

  public String getEmail() {
    return email;
  }

  public URI getCallbackURI() {
    return callbackURI;
  }

  public String getScope() {
    return scope;
  }
}

