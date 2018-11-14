package com.cg.bean;

import java.io.Serializable;

import javax.persistence.*;;

@Entity
public class Address implements Serializable
{
	

	private static final long serialVersionUID=1L;
	@Id
	@Column(name="ADDRESS_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addressId;
	
	@Column(name="ADDRESS_STREET",length=25)
	private String street;
	
	@Column(name="ADDRESS_CITY",length=25)
	private String city;
	
	@Column(name="ADDRESS_STATE",length=25)
	private String state;
	
	@Column(name="ADRESS_ZIPCODE",length=10)
	private String zipCode;
	
	@OneToOne(mappedBy="stuAdd")
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
	

	public Address() {
		super();
		
	}

	public Address(int addressId, String street, String city, String state,
			String zipCode, Student student) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.student = student;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street
				+ ", city=" + city + ", state=" + state + ", zipCode="
				+ zipCode + ", student=" + student + "]";
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	
	
	
}
