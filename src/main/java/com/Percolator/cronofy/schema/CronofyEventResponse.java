package com.Percolator.cronofy.schema;


import com.Percolator.cronofy.CronofyEvent;
import com.Percolator.cronofy.CronofyPage;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class CronofyEventResponse {
  @JsonProperty("pages")
  private final CronofyPage page;
  @JsonProperty("events")
  private final CronofyEvent[] events;

  public CronofyEventResponse(CronofyPage page, CronofyEvent[] events) {
    this.page = page;
    this.events = events;
  }

  public CronofyEventResponse() {
    this.page = null;
    this.events = null;
  }

  public CronofyPage getPage() {
    return page;
  }

  public CronofyEvent[] getEvents() {
    return events;
  }
}


