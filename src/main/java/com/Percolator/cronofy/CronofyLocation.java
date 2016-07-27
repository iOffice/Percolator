package com.Percolator.cronofy;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CronofyLocation {
  @JsonProperty("description")
  private final String description;

  public CronofyLocation(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
