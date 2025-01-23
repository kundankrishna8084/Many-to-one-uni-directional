package com.jsp.hibernate_many_to_one_unidirectional.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
	@Id
	private int id;
	private String name;
	private String email;
	private long phone;
	
	@ManyToOne
	private Company company;
	
	
	public Employee(int id, String name, String email, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	
	
}
