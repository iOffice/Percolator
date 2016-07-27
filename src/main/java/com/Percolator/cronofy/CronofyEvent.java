package com.Percolator.cronofy;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CronofyEvent {
  @JsonProperty("calendar_id")
  private final String calendarId;
  @JsonProperty("event_uid")
  private final String eventUId;
  @JsonProperty("summary")
  private final String summery;
  @JsonProperty("description")
  private final String description;
  @JsonProperty("start")
  private final Date start;
  @JsonProperty("end")
  private final Date end;
  @JsonProperty("deleted")
  private final Boolean deleted;
  @JsonProperty("created")
  private final Date created;
  @JsonProperty("updated")
  private final Date updated;
  @JsonProperty("participation_status")
  private final String participationStatus;
  @JsonProperty("attendees")
  private final CronofyAttendee[] attendees;
  @JsonProperty("transparency")
  private final String transparency;
  @JsonProperty("status")
  private final String status;
  @JsonProperty("categories")
  private final String[] categories;
  @JsonProperty("recurring")
  private final Boolean recurring;
  @JsonProperty("options")
  private final CronofyOption options;

  public CronofyEvent(String calendarId, String eventUId, String summery, String description,
                      Date start,
                      Date end, Boolean deleted, Date created, Date updated,
                      String participationStatus,
                      CronofyAttendee[] attendees, String transparency, String status,
                      String[] categories,
                      Boolean recurring, CronofyOption options) {
    this.calendarId = calendarId;
    this.eventUId = eventUId;
    this.summery = summery;
    this.description = description;
    this.start = start;
    this.end = end;
    this.deleted = deleted;
    this.created = created;
    this.updated = updated;
    this.participationStatus = participationStatus;
    this.attendees = attendees;
    this.transparency = transparency;
    this.status = status;
    this.categories = categories;
    this.recurring = recurring;
    this.options = options;

  }

  public CronofyEvent() {
    this.calendarId = null;
    this.eventUId = null;
    this.summery = null;
    this.description = null;
    this.start = null;
    this.end = null;
    this.deleted = null;
    this.created = null;
    this.updated = null;
    this.participationStatus = null;
    this.attendees = null;
    this.transparency = null;
    this.status = null;
    this.categories = null;
    this.recurring = null;
    this.options = null;

  }

  public String getCalendarId() {
    return calendarId;
  }

  public String getEventUId() {
    return eventUId;
  }

  public String getSummery() {
    return summery;
  }

  public String getDescription() {
    return description;
  }

  public Date getStart() {
    return start;
  }

  public Date getEnd() {
    return end;
  }

  public Boolean getDeleted() {
    return deleted;
  }

  public Date getCreated() {
    return created;
  }

  public Date getUpdated() {
    return updated;
  }

  public String getParticipationStatus() {
    return participationStatus;
  }

  public CronofyAttendee[] getAttendees() {
    return attendees;
  }

  public String getTransparency() {
    return transparency;
  }

  public String getStatus() {
    return status;
  }

  public String[] getCategories() {
    return categories;
  }

  public Boolean getRecurring() {
    return recurring;
  }

  public CronofyOption getOptions() {
    return options;
  }
}



