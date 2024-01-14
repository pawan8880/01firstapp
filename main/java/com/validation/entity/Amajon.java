package com.validation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name="AMAJON")
public class Amajon {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="name")
	 @NotBlank(message = "Name cannot be blank")
	private String name;
	@Column(name="gmail")
	@Email(message = "Invalid Gmail address")
	private String gmail;
	
	@Positive(message = "Mobile number must be a positive value")
	private long mobile;

	public Amajon(int id, @NotBlank(message = "Name cannot be blank") String name,
			@Email(message = "Invalid Gmail address") String gmail,
			@Positive(message = "Mobile number must be a positive value") long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.gmail = gmail;
		this.mobile = mobile;
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

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Amajon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
