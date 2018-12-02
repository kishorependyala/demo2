package com.example.demo2.rest;


import com.example.demo2.EmployeeCache;
import com.example.demo2.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class EmployeeController {

    @Autowired
    private  EmployeeCache employeeCache;

    @RequestMapping(value = "/employees", method = GET)
    public List<Employee> employee(){
        return employeeCache.employees();
    }

    @RequestMapping(value = "/employees", method = POST, headers = "Accept=application/json")
    public Employee create(@RequestBody Employee employee){
        return employeeCache.put(employee);
    }

    @RequestMapping(value = "/employees/{id}", method = GET)
    public Employee get(@PathVariable int id){
        return employeeCache.get(id);
    }

    @RequestMapping(value = "/employees/{id}", method = PUT)
    public Employee update(@PathVariable int id, @RequestBody Employee employee){
        return employeeCache.put(employee);
    }

    @RequestMapping(value = "/employees/{id}", method = DELETE)
    public Employee delete(@PathVariable int id){
        return employeeCache.delete(id);
    }


}
