package com.company.employee;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")

 class Employee {
    @Column(name = "EMPLOYEE_ID")
    @Id @GeneratedValue
    private long id;

    @Column(name = "FIRST_NAME")
   private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    public Employee() {
    }

    public Employee( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId().equals(employee.getId()) &&
                getFirstName().equals(employee.getFirstName()) &&
                getLastName().equals(employee.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName());
    }

    @Override
    public String toString() {
        return String.format(
                "CustomerEntity[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
}