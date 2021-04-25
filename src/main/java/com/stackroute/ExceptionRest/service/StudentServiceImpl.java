package com.stackroute.ExceptionRest.service;

import com.stackroute.ExceptionRest.exception.StudentEmailExistsException;
import com.stackroute.ExceptionRest.model.Student;
import com.stackroute.ExceptionRest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentServiceDAO{
    private StudentRepository repository;
    @Autowired
    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }
    @Override
    public Student saveStudent(Student student) throws StudentEmailExistsException {
        if(repository.existsBystdEmail(student.getStdEmail()))
            throw new StudentEmailExistsException();
        return repository.save(student);
    }
    @Override
    public List<Student> getAllStudent() {
        return (List<Student>) repository.findAll();
    }
}
