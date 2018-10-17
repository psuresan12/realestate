package com.realestate.model;

public class House {
	
	Long id;
	String description;
	String address;
	String city;
	Double price;
	
	public House(Long id, String description, String address, String city, Double price) {
		super();
		this.id = id;
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
