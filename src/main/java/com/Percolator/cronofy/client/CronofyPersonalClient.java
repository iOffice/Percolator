package com.Percolator.cronofy.client;


import com.Percolator.cronofy.CronofyEventSend;
import com.Percolator.cronofy.schema.CronofyCalendarResponse;
import com.Percolator.cronofy.schema.CronofyEventResponse;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.Date;


public class CronofyPersonalClient implements CronofyClient {
  private UriBuilder resourceUrl;


  public WebResource.Builder cronofyResource(UriBuilder builder, String... path) {
    UriBuilder resourceUrl = builder;
    Client client = new Client();

    for (String p : path) {
      resourceUrl.path(p);
    }
    return client.resource(resourceUrl.build())
        .type(MediaType.APPLICATION_JSON_TYPE)
        .accept(MediaType.APPLICATION_JSON_TYPE);
  }

  public WebResource.Builder cronofyResource(URI base, String... path) {
    return cronofyResource(UriBuilder.fromUri(base), path);
  }

  public WebResource.Builder cronofyApiResource(String... path) {
    return cronofyResource(DEFAULT_CRONOFY_API_URL, path);
  }

  public WebResource.Builder cronofyAppResource(String... path) {
    return cronofyResource(DEFAULT_CRONOFY_APP_URL, path);
  }

  public CronofyCalendarResponse readCalenders(String token) {
    return cronofyApiResource("/v1/calendars")
        .header("Authorization", "Bearer " + token)
        .get(CronofyCalendarResponse.class);

  }

  public CronofyEventResponse readEvents(String token, String tzid, String from, String to,
                                         Boolean managed) {
    return cronofyResource(UriBuilder.fromUri(DEFAULT_CRONOFY_API_URL)
        .queryParam("tzid", tzid)
        .queryParam("from", from)
        .queryParam("to", to)
        .queryParam("managed", managed), "/v1/events")
        .header("Authorization", "Bearer " + token)
        .get(CronofyEventResponse.class);
  }

  public CronofyEventResponse readEvents(String token, String tzid, Date from, Date to,
                                         Boolean managed) {

    return readEvents(token, tzid, from.toString(), to.toString(), managed);
  }

  public Boolean createEvent(String token, String calendarId, CronofyEventSend event) {
    cronofyApiResource("/v1/calendars/" + calendarId + "/events")
        .header("Authorization", "Bearer " + token)
        .post(event);
    return false;
  }

}
