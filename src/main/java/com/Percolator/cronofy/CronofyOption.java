package com.Percolator.cronofy;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CronofyOption {
  @JsonProperty("delete")
  private final Boolean delete;
  @JsonProperty("update")
  private final Boolean update;

  public CronofyOption(Boolean delete, Boolean update) {
    this.delete = delete;
    this.update = update;
  }

  public CronofyOption() {
    this.delete = null;
    this.update = null;
  }

  public Boolean getDelete() {
    return delete;
  }

  public Boolean getUpdate() {
    return update;
  }
}


