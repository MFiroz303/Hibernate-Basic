package com.bridgelabz.hibernateTest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="emp3")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

public class Emp {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	
	private int id;
	
	@Column(name="name")
	private String name;
	
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
	
}

