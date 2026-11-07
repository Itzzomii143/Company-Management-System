package com.app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="companies")
public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String location;
	private String industry;
	private String email;
	private String phone;
	
	
	

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", location=" + location + ", industry=" + industry + ", email="
				+ email + ", phone=" + phone + "]";
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Company(int id, String name, String location, String industry, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.industry = industry;
		this.email = email;
		this.phone = phone;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
