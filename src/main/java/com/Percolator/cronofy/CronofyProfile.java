package com.Percolator.cronofy;


import com.fasterxml.jackson.annotation.JsonProperty;

public class CronofyProfile {
  @JsonProperty("provider_name")
  private final String providerName;
  @JsonProperty("profile_id")
  private final String profileId;
  @JsonProperty("profile_name")
  private final String profileName;

  CronofyProfile(String providerName, String profileId, String profileName) {
    this.providerName = providerName;
    this.profileId = profileId;
    this.profileName = profileName;
  }

  public String getProviderName() {
    return providerName;
  }

  public String getProfileId() {
    return profileId;
  }

  public String getProfileName() {
    return profileName;
  }
}

