package com.stackroute.ExceptionRest.service;

import com.stackroute.ExceptionRest.exception.StudentEmailExistsException;
import com.stackroute.ExceptionRest.model.Student;

import java.util.List;

public interface StudentServiceDAO {
    Student saveStudent(Student student)throws StudentEmailExistsException;
    List<Student> getAllStudent();

}
