package com.example.demo2;

import com.example.demo2.domain.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeCache {

    private Map<Integer, Employee> employeeCache = new HashMap<>();

    public  EmployeeCache(){

    }
    public EmployeeCache(Employee... employees){
        for(Employee employee:employees){
            this.employeeCache.put(employee.getId(),employee);
        }
    }
    public List<Employee> employees(){
        return new ArrayList<>(employeeCache.values());
    }

    public Employee put(Employee employee){
        return this.employeeCache.put(employee.getId(), employee);
    }

    public Employee delete(int id){
        return this.employeeCache.remove(id);
    }

    public Employee get(int employeeId){
        return this.employeeCache.get(employeeId);
    }


    @Override
    public String toString() {
        return "EmployeeCache{" +
                "size=" + size()+
                '}';
    }

    public int size(){
        return employeeCache.size();
    }
}
