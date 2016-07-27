package com.Percolator.cronofy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.SimpleDateFormat;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CronofyEventSend {
  @JsonProperty("event_id")
  private final String eventId;
  @JsonProperty("summary")
  private final String summery;
  @JsonProperty("description")
  private final String description;
  @JsonProperty("start")
  private final String start;
  @JsonProperty("end")
  private final String end;
  @JsonProperty("tzid")
  private final String tzid;
  @JsonProperty("location")
  private final CronofyLocation location;

  private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

  public CronofyEventSend(String eventId, String summery, String description, Date start, Date end,
                          String tzid, CronofyLocation location) {
    this.eventId = eventId;
    this.summery = summery;
    this.description = description;
    this.start = sdf.format(start).toString();
    this.end = sdf.format(end).toString();
    this.tzid = tzid;
    this.location = location;
  }

  CronofyEventSend() {
    this.eventId = null;
    this.summery = null;
    this.description = null;
    this.start = null;
    this.end = null;
    this.tzid = null;
    this.location = null;
  }

  public String getEventId() {
    return eventId;
  }

  public String getSummery() {
    return summery;
  }

  public String getDescription() {
    return description;
  }

  public String getStart() {
    return start;
  }

  public String getEnd() {
    return end;
  }

  public String getTzid() {
    return tzid;
  }

  public CronofyLocation getLocation() {
    return location;
  }
}





