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
	private String CEP;
	private String street;
	private String neighborhood;
	private String state;
	private String city;
	private String phone;
	private String ray;
	private String username;
	private String email;
	private String propertySize;
	private Integer rooms;
	private String bathroom;
	private String rating;
    private String price;
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

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String CEP) {
		this.CEP = CEP;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRay() {
		return ray;
	}

	public void setRay(String ray) {
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

	public String getBathroom() {
		return bathroom;
	}
	public void setBathroom(String bathroom) {
		this.bathroom = bathroom;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
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
		return "Advertisement [Id=" + id + ", advertiser=" + advertiser + ", CEP=" + CEP + ", phone=" + phone + ", ray=" + ray + ", username=" + username + ", email=" + email + ", property size=" + propertySize + ", rooms=" + rooms + ", bathroom=" + bathroom + ", rating=" + rating + ", price=" + price + ", gender=" + gender + ", lat=" + lat + ", lon=" + lon + "]";
	}

}
