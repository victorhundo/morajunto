package com.es.models;

import java.io.Serializable;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Advertisement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	
	private String propertySize;
	private Boolean bathroom;
    private Float price;
    private String minTime;
    private String gender;
    private String lat;
    private String lon;
	
	public Advertisement() {
		// TODO Auto-generated constructor stub
	}
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	
	public String getPropertySize() {
		return propertySize;
	}
	public void setPropertySize(String propertySize) {
		this.propertySize = propertySize;
	}
	public Boolean getBathroom() {
		return bathroom;
	}
	public void setBathroom(Boolean bathroom) {
		this.bathroom = bathroom;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
    }
    public String getMinTime() {
		return minTime;
	}
	public void setMinTime(String minTime) {
		this.minTime = minTime;
    }
    public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
    }
    public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
    }
    public String getLon() {
		return lon;
	}
    public void setLon(String lon) {
		this.lon = lon;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "Advertisement [Id=" + id + ", property size=" + propertySize + ", bathroom=" + bathroom + ", price=" + price + ", minimum time=" + minTime + ", gender=" + gender + ", lat=" + lat + ", lon=" + lon + "]";
	}

}
