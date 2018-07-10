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
	
	private String advertiser;
	private Integer CEP;
	private Integer phone;
	private Integer ray;
	private String username;
	private String email;
	private String propertySize;
	private Integer rooms;
	private Boolean bathroom;
	private Integer rating;
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

	public String getAdvertiser() {
		return advertiser;
	}

	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}

	public Integer getCEP() {
		return CEP;
	}

	public void setCEP(Integer CEP) {
		this.CEP = CEP;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Integer getRay() {
		return ray;
	}

	public void setRay(Integer ray) {
		this.ray = ray;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPropertySize() {
		return propertySize;
	}
	public void setPropertySize(String propertySize) {
		this.propertySize = propertySize;
	}

	public Integer getRooms() {
		return rooms;
	}

	public void setRooms(Integer rooms) {
		this.rooms = rooms;
	}

	public Boolean getBathroom() {
		return bathroom;
	}
	public void setBathroom(Boolean bathroom) {
		this.bathroom = bathroom;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
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
		return "Advertisement [Id=" + id + ", advertiser=" + advertiser + ", CEP=" + CEP + ", phone=" + phone + ", ray=" + ray + ", username=" + username + ", email=" + email + ", property size=" + propertySize + ", rooms=" + rooms + ", bathroom=" + bathroom + ", rating=" + rating + ", price=" + price + ", minimum time=" + minTime + ", gender=" + gender + ", lat=" + lat + ", lon=" + lon + "]";
	}

}
