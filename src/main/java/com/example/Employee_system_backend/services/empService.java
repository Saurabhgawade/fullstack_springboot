package com.example.Employee_system_backend.services;

import com.example.Employee_system_backend.models.Emp;

import java.util.List;

public interface empService {
    public Emp createemp(Emp emp);

    public List<Emp> getAllEmp();

    public Emp getEmpById(int id);

    public void deleteEmp(int id);

    public Emp updateemp(int id,Emp emp);
}
