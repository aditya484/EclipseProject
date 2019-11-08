package com.learning.bean;

public class UserBean {

	private String userName;
	private String emailAddress;
	private long phoneNumber;
	private String city;
	private String state;
	private String country;
	private long zipcode;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	
	@Override
	public String toString() {
		return "UserBean [userName=" + userName + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", zipcode=" + zipcode + "]";
	}
	
	
}
