package com.Percolator.cronofy;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CronofyAttendee {
  @JsonProperty("email")
  private final String email;
  @JsonProperty("display_name")
  private final String displayName;
  @JsonProperty("status")
  private final String status;

  public CronofyAttendee(String email, String displayName, String status) {
    this.email = email;
    this.displayName = displayName;
    this.status = status;
  }

  public CronofyAttendee() {
    this.email = null;
    this.displayName = null;
    this.status = null;
  }

  public String getEmail() {
    return email;
  }

  public String getDisplayName() {
    return displayName;
  }

  public String getStatus() {
    return status;
  }
}
