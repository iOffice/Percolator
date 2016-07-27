package com.Percolator.cronofy.client;


import com.Percolator.cronofy.CronofyEventSend;
import com.Percolator.cronofy.schema.CronofyAuthorizationTokenRequest;
import com.Percolator.cronofy.schema.CronofyCalendarResponse;
import com.Percolator.cronofy.schema.CronofyEventResponse;
import com.Percolator.cronofy.schema.CronofyTokenResponse;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.Date;

import static com.google.common.base.Preconditions.checkNotNull;


public class CronofyAppClient implements CronofyClient {

  private static final URI DEFAULT_CRONOFY_API_URL = URI.create("https://api.cronofy.com/");
  private static final URI DEFAULT_CRONOFY_APP_URL = URI.create("https://app.cronofy.com/");
  private final String _clientId;
  private final String _clientSecret;
  private final Client _httpClient;
  private final URI _cronofyApiUrl;

  private CronofyAppClient(String clientId, String clientSecret, URI uri, Client client) {
    _clientId = checkNotNull(clientId, "application key is null");
    _clientSecret = checkNotNull(clientSecret, "apiKey is null");
    _httpClient = checkNotNull(client, "client is null");
    _cronofyApiUrl = checkNotNull(uri, "URI is null");
  }


  public WebResource.Builder cronofyResource(URI base, String... path) {
    UriBuilder resourceUrl = UriBuilder.fromUri(base);
    Client client = new Client();

    for (String p : path) {
      resourceUrl.path(p);
    }
    return client.resource(resourceUrl.build())
        .type(MediaType.APPLICATION_JSON_TYPE)
        .accept(MediaType.APPLICATION_JSON_TYPE);
  }

  public WebResource.Builder cronofyApiResource(String... path) {
    return cronofyResource(DEFAULT_CRONOFY_API_URL, path);
  }

  public WebResource.Builder cronofyAppResource(String... path) {
    return cronofyResource(DEFAULT_CRONOFY_APP_URL, path);
  }


  public CronofyCalendarResponse readCalenders(String token) {
    return null;
  }

  public CronofyEventResponse readEvents(String token, String tzid, Date from, Date to,
                                         Boolean managed) {
    return null;
  }

  public Boolean createEvent(String token, String calendarId, CronofyEventSend event) {

    return false;
  }


  public CronofyTokenResponse getUserToken(String code, URI redirectURI) throws Exception {
    try {
      return cronofyApiResource("/oauth/token")
          .post(CronofyTokenResponse.class, new CronofyAuthorizationTokenRequest(_clientId, _clientSecret, code, redirectURI));
    } catch (UniformInterfaceException ex) {
      throw new Exception(ex);
    }
  }


}
