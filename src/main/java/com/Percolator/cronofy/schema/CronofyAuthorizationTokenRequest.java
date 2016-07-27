package com.Percolator.cronofy.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URI;

import static com.Percolator.cronofy.CronofyGrantType.AUTHORIZATION_CODE;


public class CronofyAuthorizationTokenRequest {

  @JsonProperty("client_id")
  private final String _clientId;
  @JsonProperty("client_secret")
  private final String _clientSecret;
  @JsonProperty("grant_type")
  private final String _grantType;
  @JsonProperty("code")
  private final String _code;
  @JsonProperty("redirect_uri")
  private final URI _redirectURI;

  public CronofyAuthorizationTokenRequest(String _clientId, String _clientSecret, String _code,
                                          URI _redirectURI) {
    this._clientId = _clientId;
    this._clientSecret = _clientSecret;
    this._grantType = AUTHORIZATION_CODE.toString();
    this._code = _code;
    this._redirectURI = _redirectURI;
  }

  public String get_clientId() {
    return _clientId;
  }

  public String get_clientSecret() {
    return _clientSecret;
  }

  public String get_grantType() {
    return _grantType;
  }

  public String get_code() {
    return _code;
  }

  public URI get_redirectURI() {
    return _redirectURI;
  }
}
