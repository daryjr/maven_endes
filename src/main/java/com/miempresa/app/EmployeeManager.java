package com.miempresa.app;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    private List<Employee> employees = new ArrayList<>();

    // @param name Nombre del empleado.
    // @param years Años en la empresa.

    public void addEmployee(String name, int years) {
        employees.add(new Employee(name, years));
        System.out.println(name + " added to the system.");
    }

    public void printEmployees() {
        System.out.println("List of employees:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
