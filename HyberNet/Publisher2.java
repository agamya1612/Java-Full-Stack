package com.myapp.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Publisher2 {


	private int pubId;
	private String pubName;
	public int getPubId() {
		return pubId;
	}
	public void setPubId(int pubId) {
		this.pubId = pubId;
	}
	public String getPubName() {
		return pubName;
	}
	public void setPubName(String pubName) {
		this.pubName = pubName;
	}
	public Publisher2(int pubId, String pubName) {
		super();
		this.pubId = pubId;
		this.pubName = pubName;
	}
	public Publisher2() {
		// TODO Auto-generated constructor stub
	}
	
}