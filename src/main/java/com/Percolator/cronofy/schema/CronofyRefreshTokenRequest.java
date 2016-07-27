package com.Percolator.cronofy.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import static com.Percolator.cronofy.CronofyGrantType.REFRESH_TOKEN;


public class CronofyRefreshTokenRequest {
  @JsonProperty("client_id")
  private final String _clientId;
  @JsonProperty("client_secret")
  private final String _clientSecret;
  @JsonProperty("grant_type")
  private final String _grantType;
  @JsonProperty("code")
  private final String _code;


  CronofyRefreshTokenRequest(String _clientId, String _clientSecret, String _code) {
    this._clientId = _clientId;
    this._clientSecret = _clientSecret;
    this._grantType = REFRESH_TOKEN.toString();
    this._code = _code;
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
}



