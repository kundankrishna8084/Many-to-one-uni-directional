package com.jsp.hibernate_many_to_one_unidirectional.dao;

import com.jsp.hibernate_many_to_one_unidirectional.entity.Company;
import com.jsp.hibernate_many_to_one_unidirectional.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeCompanyDao {
	EntityManager em= Persistence
			.createEntityManagerFactory("hibernate-advjavaSpider")
			.createEntityManager();
	
	EntityTransaction et = em.getTransaction();
	
	/*
	// return List of employee 
	public List<Employee> saveEmployeeCompanyDao(List<Employee> employees,Company company) {
		try {
			et.begin();
			em.persist(company);
			for (Employee employee : employees) {
				em.persist(employee);
			}
			et.commit();
			return employees;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		*/
	
		// return employee

		public Employee saveEmployeeCompanyDao(Employee employees, Company company) {
			try {
				et.begin();
				em.persist(company);
				em.persist(employees);
				et.commit();
				return employees;

			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}

		public Employee saveEmployeeCompanyAssociateWithCompanyDao(Employee employee, int companyId) {

			Company company1 = em.find(Company.class, companyId);

			if (company1 != null) {
				try {
					employee.setCompany(company1);
					et.begin();
					em.persist(employee);
					et.commit();
					System.out.println("Employee saved and Associated with company id" + companyId);
					return employee;
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("There is some Exception");
					return null;
				}
			} else {
				System.out.println("Given company id is not found");
				return null;
			}
		}

	}
