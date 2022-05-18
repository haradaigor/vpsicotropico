package vpsicotropico.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	
	private String street;
	private Integer number;
	private String complement;
	private String district;
	private String city;
	private String state;
	
	public Address() {
		
	}

	public Address(String street, Integer number, String district, String city, String state) {
		this.street = street;
		this.number = number;
		this.district = district;
		this.city = city;
		this.state = state;
	}

	public Address(String street, Integer number, String complement, String district, String city, String state) {
		this.street = street;
		this.number = number;
		this.complement = complement;
		this.district = district;
		this.city = city;
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
	
}
