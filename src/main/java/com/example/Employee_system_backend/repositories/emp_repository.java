package com.example.Employee_system_backend.repositories;

import com.example.Employee_system_backend.models.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface emp_repository extends JpaRepository<Emp,Integer> {
}
