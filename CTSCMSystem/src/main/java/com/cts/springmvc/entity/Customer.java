package com.cts.springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "newcustomer")
public class Customer {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column 
	@NotEmpty(message = "Please enter username")
	private String username;
	@NotEmpty(message = "Please enter password")
	@Column
	private String password;
//	@Size(max = 20, min = 3, message = "Name length must be between {2} and {1} characters")

	@NotEmpty(message = "Please enter Empname")
	@Column
	private String name;
	@NotEmpty(message = "Please enter valid email")
	@Column
	private String email;
	@Column
	@Size(max = 10, min = 10, message = " Mobile No length  must be 10 numbers")

	@NotEmpty(message = "Please enter Mobile number")
	private String mobileno;
	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	@NotEmpty(message = "Please enter Address")
	@Column
	private String address;

	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	

}
