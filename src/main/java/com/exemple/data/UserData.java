package com.exemple.data;


public class UserData {
	
	public String fullName;
	public String email;
	public String phone;
	public String adress;
	public String city;
	public String password;
	public String passrepeat;

	
	public UserData(String fullName,
					String email, 
					String phone, 
					String adress, 
					String city,
					String password,
					String passrepeat) {
		
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.adress = adress;
		this.city = city;
		this.password = password;
		this.passrepeat = passrepeat;
		
		
	}

	

}