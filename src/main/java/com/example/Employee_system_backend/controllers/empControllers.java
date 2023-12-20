package com.example.Employee_system_backend.controllers;

import com.example.Employee_system_backend.models.Emp;
import com.example.Employee_system_backend.services.empService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="http://localhost:3000")
@Controller
@RequestMapping("/api/v1/")
public class empControllers {
    @Autowired
    private empService empService;
    @PostMapping("/save")
     public ResponseEntity<Emp>createemp(@RequestBody Emp emp){
        return new ResponseEntity<>(empService.createemp(emp), HttpStatus.CREATED);


    }
    @GetMapping("/")
    public ResponseEntity<List<Emp>>getAllEmployee(){
        return new ResponseEntity<List<Emp>>(empService.getAllEmp(),HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Emp>getEmpById(@PathVariable Integer id){
        return new ResponseEntity<Emp>(empService.getEmpById(id),HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public  ResponseEntity<String>deleteById(@PathVariable Integer id){
        empService.deleteEmp(id);
        return new ResponseEntity<String>("deleted successfully",HttpStatus.OK);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<Emp>updateById(@PathVariable Integer id,@RequestBody Emp emp){
        return new ResponseEntity<Emp>(empService.updateemp(id,emp),HttpStatus.OK);
    }
}
