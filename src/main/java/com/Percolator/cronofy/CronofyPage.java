package com.Percolator.cronofy;


import com.fasterxml.jackson.annotation.JsonProperty;

public class CronofyPage {
  @JsonProperty("current")
  private final int current;
  @JsonProperty("total")
  private final int total;

  public CronofyPage(int current, int total) {
    this.current = current;
    this.total = total;
  }

  public CronofyPage() {
    this.current = 0;
    this.total = 0;
  }

  public int getCurrent() {
    return current;
  }

  public int getTotal() {
    return total;
  }
}


