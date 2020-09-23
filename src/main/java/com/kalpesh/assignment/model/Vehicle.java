package com.kalpesh.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
@SequenceGenerator(name = "v_seq", initialValue = 101, allocationSize = 200)
public class Vehicle {
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "v_seq")
	@Id
	@Column(name = "v_id")
	private Long vId;

	@Column(name = "lpn")
	private String licensePlateNumber;

	public Long getvId() {
		return vId;
	}

	public void setvId(Long vId) {
		this.vId = vId;
	}

	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}

}