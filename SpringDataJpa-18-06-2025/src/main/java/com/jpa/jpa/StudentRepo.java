package com.jpa.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	

}
