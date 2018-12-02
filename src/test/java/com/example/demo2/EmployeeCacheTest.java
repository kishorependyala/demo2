package com.example.demo2;

import com.example.demo2.domain.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeCacheTest {



    @Test
    public void employees() {

        Employee employee1 = new Employee.EmployeeBuilder().withFirstName("krishna").withLastName("pindipol").withId(1).build();
        Employee employee2 = new Employee.EmployeeBuilder().withFirstName("kishore").withLastName("pendyala").withId(2).build();

        EmployeeCache employeeCache = new EmployeeCache(employee1,employee2);
        assertEquals("EmployeeCache{size=2}",employeeCache.toString());
    }

    @Test
    public void put() {
        Employee employee1 = new Employee.EmployeeBuilder().withFirstName("krishna").withLastName("pindipol").withId(1).build();
        EmployeeCache employeeCache = new EmployeeCache();
        Employee employee = employeeCache.put(employee1);
        assertEquals(null, employee);
    }

    @Test
    public void delete() {

        Employee employee1 = new Employee.EmployeeBuilder().withFirstName("krishna").withLastName("pindipol").withId(1).build();
        Employee employee2 = new Employee.EmployeeBuilder().withFirstName("kishore").withLastName("pendyala").withId(2).build();
        EmployeeCache employeeCache = new EmployeeCache(employee1,employee2);
        Employee delete = employeeCache.delete(1);
        assertEquals(1,employeeCache.size());
        assertEquals(employee1,delete);
    }

    @Test
    public void get() {

        Employee employee1 = new Employee.EmployeeBuilder().withFirstName("krishna").withLastName("pindipol").withId(1).build();
        Employee employee2 = new Employee.EmployeeBuilder().withFirstName("kishore").withLastName("pendyala").withId(2).build();

        EmployeeCache employeeCache = new EmployeeCache(employee1,employee2);
        assertEquals(employee1,employeeCache.get(1));
        assertEquals(employee2,employeeCache.get(2));

    }
}