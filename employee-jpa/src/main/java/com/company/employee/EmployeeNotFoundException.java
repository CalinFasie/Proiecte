package com.company.employee;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(Long id) {

        super ("Unable to find the employee" + id);
    }
}