package com.Percolator.cronofy.client;


import com.Percolator.cronofy.CronofyEventSend;
import com.Percolator.cronofy.schema.CronofyCalendarResponse;
import com.Percolator.cronofy.schema.CronofyEventResponse;
import com.sun.jersey.api.client.WebResource;

import java.net.URI;
import java.util.Date;

public interface CronofyClient {
  static final URI DEFAULT_CRONOFY_API_URL = URI.create("https://api.cronofy.com/");
  static final URI DEFAULT_CRONOFY_APP_URL = URI.create("https://app.cronofy.com/");


  CronofyCalendarResponse readCalenders(String token);

  CronofyEventResponse readEvents(String token, String tzid, Date from, Date to, Boolean managed);

  Boolean createEvent(String token, String calendarId, CronofyEventSend event);


  WebResource.Builder cronofyResource(URI base, String... path);

  WebResource.Builder cronofyApiResource(String... path);

  WebResource.Builder cronofyAppResource(String... path);


}
