package com.stackroute.ExceptionRest.controller;

import com.stackroute.ExceptionRest.exception.StudentEmailExistsException;
import com.stackroute.ExceptionRest.model.Student;
import com.stackroute.ExceptionRest.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    private StudentServiceImpl service;
    @Autowired
    public StudentController(StudentServiceImpl service) {
        this.service = service;
    }
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAll(){
        return  new ResponseEntity<>(service.getAllStudent(), HttpStatus.OK);
    }
    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student) throws StudentEmailExistsException {
        return service.saveStudent(student);
    }
//    @ExceptionHandler(value = StudentEmailExistsException.class)
//    public ResponseEntity<String>studentAlreadyExist(StudentEmailExistsException e){
//        return new ResponseEntity<>("Student already exist with email",HttpStatus.CONFLICT);
//    }
}
