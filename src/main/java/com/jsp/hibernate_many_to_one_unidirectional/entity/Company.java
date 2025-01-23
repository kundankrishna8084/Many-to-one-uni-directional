package com.jsp.hibernate_many_to_one_unidirectional.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Company {
	@Id
	private int id;
	private String name;
	private String addrtess;
	private String gstNumber;
	

}
