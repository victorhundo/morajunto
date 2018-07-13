package com.es.models;

import java.io.Serializable;

import javax.validation.constraints.Email;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private String name;
	private String CPF;
	private String contact;
	private String username;
	private String password;
	private Integer age;
	private String email;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "User [Id=" + id + ", name=" + name + ", CPF=" + CPF + ", contact=" + contact + ", username=" + username + ", password=" + password + ", age=" + age + ", email=" + email + "]";
	}

}
