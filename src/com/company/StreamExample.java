package com.company;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    private Employee[] employees ={new Employee(1,"Ravi", 100.00),
            new Employee(2,"Pooja",200.00) ,
            new Employee(3,"Sachin",300.00)};

    private List<Employee> employeeList = Arrays.asList(employees);

    @Test
    public void testListIncrement(){
        System.out.println(employeeList);
        employeeList.stream().forEach(e->e.setSalary(e.getSalary()+100));
        System.out.println(employeeList);
    }

    @Test
    public void testMapMethod(){
       List<String> empname= employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(empname);
    }

    @Test
    public void testMapFilterMethod(){
        List<String> empname= employeeList.stream()
                .map(Employee::getName)
                .filter(e->"Ravi".equals(e))
                .collect(Collectors.toList());
        System.out.println(empname);
    }


}
