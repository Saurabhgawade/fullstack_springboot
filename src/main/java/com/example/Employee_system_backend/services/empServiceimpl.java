package com.example.Employee_system_backend.services;

import com.example.Employee_system_backend.models.Emp;
import com.example.Employee_system_backend.repositories.emp_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class empServiceimpl implements empService{

    @Autowired
    private emp_repository empRepository;

    @Override
    public Emp createemp(Emp emp) {
        return empRepository.save(emp);
    }

    @Override
    public List<Emp> getAllEmp() {
        return empRepository.findAll();
    }

    @Override
    public Emp getEmpById(int id) {
        return empRepository.findById(id).get();
    }

    @Override
    public void deleteEmp(int id) {
        Emp emp=empRepository.findById(id).get();
        if(emp!=null){
            empRepository.delete(emp);
        }


    }
    @Override
    public Emp updateemp(int id,Emp emp){
        Emp oldEmp=empRepository.findById(id).get();
        if(oldEmp!=null){
            emp.setId(id);
            return empRepository.save(emp);
        }
        return null;

    }
}
