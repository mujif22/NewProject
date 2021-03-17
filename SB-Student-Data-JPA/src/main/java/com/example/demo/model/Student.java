package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Student")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name = "STU_ID")
	private Integer sId;
	
	@Column(name = "STU_NAME")
	private String sName;
	
	@Column(name = "STU_ADDRESS")
	private String sAddress;
	

}