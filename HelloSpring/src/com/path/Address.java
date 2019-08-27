package com.path;

public class Address {
	String addressLine;
	String city;
	String pincode;

	public Address(String addressLine, String city, String pincode) {
		super();
		this.addressLine = addressLine;
		this.city = city;
		this.pincode = pincode;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
