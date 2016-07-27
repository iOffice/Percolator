package com.Percolator.cronofy;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CronofyCalendar {
  @JsonProperty("provider_name")
  private final String providerName;
  @JsonProperty("profile_id")
  private final String profileId;
  @JsonProperty("profile_name")
  private final String profileName;
  @JsonProperty("calendar_id")
  private final String calendarId;
  @JsonProperty("calendar_name")
  private final String calendarName;
  @JsonProperty("calendar_readonly")
  private final Boolean calendarReadOnly;
  @JsonProperty("calendar_deleted")
  private final Boolean calandarDeleted;
  @JsonProperty("calendar_primary")
  private final Boolean calandarPrimary;
  @JsonProperty("permission_level")
  private final String permissionLevel;

  public CronofyCalendar(String providerName, String profileId, String profileName,
                         String calendarId, String calendarName, Boolean calendarReadOnly,
                         Boolean calandarDeleted, Boolean calandarPrimary,
                         String permissionLevel) {
    this.providerName = providerName;
    this.profileId = profileId;
    this.profileName = profileName;
    this.calendarId = calendarId;
    this.calendarName = calendarName;
    this.calendarReadOnly = calendarReadOnly;
    this.calandarDeleted = calandarDeleted;
    this.calandarPrimary = calandarPrimary;
    this.permissionLevel = permissionLevel;
  }

  public CronofyCalendar() {
    this.providerName = null;
    this.profileId = null;
    this.profileName = null;
    this.calendarId = null;
    this.calendarName = null;
    this.calendarReadOnly = null;
    this.calandarDeleted = null;
    this.calandarPrimary = null;
    this.permissionLevel = null;
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

  public String getCalendarId() {
    return calendarId;
  }

  public String getCalendarName() {
    return calendarName;
  }

  public Boolean getCalendarReadOnly() {
    return calendarReadOnly;
  }

  public Boolean getCalandarDeleted() {
    return calandarDeleted;
  }

  public Boolean getCalandarPrimary() {
    return calandarPrimary;
  }

  public String getPermissionLevel() {
    return permissionLevel;
  }
}

