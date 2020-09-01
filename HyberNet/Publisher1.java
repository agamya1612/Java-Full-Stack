package com.myapp.model;
import javax.persistence.Embeddable;

@Embeddable
public class Publisher1 {

private String publisherId;

private String publisherName;

public String getPublisherId() {
return publisherId;
}

public void setPublisherId(String publisherId) {
this.publisherId = publisherId;
}

public String getPublisherName() {
return publisherName;
}

public void setPublisherName(String publisherName) {
this.publisherName = publisherName;
}

public Publisher1(String publisherId, String publisherName) {
super();
this.publisherId = publisherId;
this.publisherName = publisherName;
}
public Publisher1() {
// TODO Auto-generated constructor stub
}
}