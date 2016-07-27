package com.Percolator.cronofy.schema;


import com.Percolator.cronofy.CronofyCalendar;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CronofyCalendarResponse {
  @JsonProperty("calendars")
  private final CronofyCalendar[] calendars;

  public CronofyCalendarResponse(CronofyCalendar[] calendars) {
    this.calendars = calendars;
  }

  public CronofyCalendarResponse() {
    this.calendars = null;
  }

  public CronofyCalendar[] getCalendars() {
    return calendars;
  }
}
