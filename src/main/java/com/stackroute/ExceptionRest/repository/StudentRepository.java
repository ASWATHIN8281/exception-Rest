package com.stackroute.ExceptionRest.repository;

import com.stackroute.ExceptionRest.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {
    public boolean existsBystdEmail(String email);
}
