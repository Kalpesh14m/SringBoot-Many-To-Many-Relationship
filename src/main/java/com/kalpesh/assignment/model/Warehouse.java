package com.kalpesh.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "warehouse")
@SequenceGenerator(name = "w_seq", initialValue = 1, allocationSize = 100)
public class Warehouse {
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "w_seq")
	@Id
	@Column(name = "w_id")
	private Long wId;

	@Column(name = "w_name")
	private String wName;

	public Long getwId() {
		return wId;
	}

	public void setwId(Long wId) {
		this.wId = wId;
	}

	public String getwName() {
		return wName;
	}

	public void setwName(String wName) {
		this.wName = wName;
	}

}
