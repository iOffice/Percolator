package com.Percolator.cronofy.schema;


import com.Percolator.cronofy.CronofyProfile;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CronofyTokenResponse {
  @JsonProperty("access_token")
  private final String accessToken;
  @JsonProperty("token_type")
  private final String tokenType;
  @JsonProperty("expires_in")
  private final int expiresIn;
  @JsonProperty("refresh_token")
  private final String refreshToken;
  @JsonProperty("scope")
  private final String scope;
  @JsonProperty("account_id")
  private final String accountId;
  @JsonProperty("linking_profile")
  private final CronofyProfile linkingProfile;

  CronofyTokenResponse(String accessToken, String tokenType, int expiresIn, String refreshToken,
                       String scope, String accountId, CronofyProfile linkingProfile) {
    this.accessToken = accessToken;
    this.tokenType = tokenType;
    this.expiresIn = expiresIn;
    this.refreshToken = refreshToken;
    this.scope = scope;
    this.accountId = accountId;
    this.linkingProfile = linkingProfile;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public String getTokenType() {
    return tokenType;
  }

  public int getExpiresIn() {
    return expiresIn;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public String getScope() {
    return scope;
  }

  public String getAccountId() {
    return accountId;
  }

  public CronofyProfile getLinkingProfile() {
    return linkingProfile;
  }
}

