package com.realestate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class House {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@NotNull
	@Size(min=2, message="Description should have atleast 2 characters")
	@Size(max=250, message="Description should have max of 250 characters")
	String description;
	
	@NotNull
	@Size(min=2, message="Address should have atleast 2 characters")
	@Size(max=250, message="Address should have max of 250 characters")
	String address;
	
	@NotNull
	@Size(min=2, message="City should have atleast 2 characters")
	@Size(max=250, message="City should have max of 250 characters")
	String city;
	
	@NotNull
	Double price;
	
	public House() {
		super();
	}
	
	public House(String description, String address, String city, Double price) {
		super();
		this.description = description;
		this.address = address;
		this.city = city;
		this.price = price;
	}
		
	public Long getId() {
			return id;
	}
		
	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
