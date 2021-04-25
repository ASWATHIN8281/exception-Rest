package com.stackroute.ExceptionRest.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
public class Student {
    @Id
    private int stdId;
    @NotNull
    @Size(min=4,max=20,message = "Name should have atleast 4 character ")
    private String stdName;
    @NotNull
    @Email
    private String stdEmail;

    public Student() {
    }

    public Student(int stdId, String stdName, String stdEmail) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdEmail = stdEmail;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdEmail() {
        return stdEmail;
    }

    public void setStdEmail(String stdEmail) {
        this.stdEmail = stdEmail;
    }
}
