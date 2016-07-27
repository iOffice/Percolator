# Percolator
Java wrapper for the Cronofy Rest Api

(note this is still very much a work in progress)

Overview
--------
Project Percolator was created out of testing and reverse engineering the Cronofy Api endpoints. It allows for the conversion of Json objects to baseic java classes which then could be used in any project. The project is split into 3 main parts. 

* The Clients package
* The Schema package
* Base classes




The Clients Package
--------
The clients package serves as the main connector to the Cronofy api. There are two clients, the CronofyAppClient and the CronofyPersonalClient. Due to features being limited conserning interactions with a cronofy "Personal Token" I decided to create a client to reflect that.
* Note that Personal Tokens are created directly from the cronofy developer dashboard




The Schema package
--------
The schema package holds the schemas for all the difrent request and response payloads. These implament the base cronofy classes to recreate the structures expected before they are sent.




The Base classes
--------
The base classes are the lowest level classes that mostly consist of string/ boolean/ date classes.




Testing
--------
coming soon




Examples
--------
```java
new CronofyPersonalClient().readCalenders("***TOKEN***")
// reads the calendars available to the token given


new CronofyPersonalClient().readEvents("****TOKEN***","Etc/UTC","2016-07-18T17:20:46","2016-07-21T17:20:46",false)
// reads the events from all calendars available from the token given


DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
CronofyEventSend event = new CronofyEventSend(
      "***EVENT ID***",
      "Created with Cronofy",
      "You can put notes in here",
      format.parse("2016-07-21T17:00:00"),
      format.parse("2016-07-22T18:00:00"),
      "Etc/UTC",
      location
    )
Boolean sent = new CronofyPersonalClient().createEvent(
  "***TOKEN***",
  "***CALANDAR ID***",event
)
// creats / updates (based on if the event id is unique) to the token and calendar given by the user.
```




Links
-----
Main Page
https://www.cronofy.com/

API Docs
https://www.cronofy.com/developers/api/
