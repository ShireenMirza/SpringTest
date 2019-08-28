package com.path;

public class VIP extends Person {
	String security;

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	@Override
	public String toString() {
		return super.toString() + " VIP [security=" + security + "]";
	}

}
