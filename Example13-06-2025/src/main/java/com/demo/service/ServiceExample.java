package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.Employe;

@Service

public class ServiceExample {
	@Autowired
	private Employe employe;

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public void ServiceEmployedata() {
		String result = employe.EmployeeData();
		System.out.println(result);

	}
}
