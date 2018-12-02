package com.example.demo2.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void toStringTest(){

        Employee employee = new Employee.EmployeeBuilder().withFirstName("krishna").withLastName("Pindipol").withId(1).build();

        assertEquals("Employee{id=1, firstName='krishna', lastName='Pindipol'}",employee.toString());
    }

}