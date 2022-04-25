/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthBuddy.models.Employee;

import java.util.ArrayList;

/**
 *
 * @author Dimple Patel
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeDirectory;

    public EmployeeDirectory() {
        employeeDirectory = new ArrayList();
    }
    
    public ArrayList<Employee> getEmployeeDirectory() 
    {
        return employeeDirectory;
    }
    
    public Employee addEmployee(String empName)
    {
        Employee employee = new Employee();
        employee.setEmployeeName(empName);
        employeeDirectory.add(employee);
        return employee;
    }  
    
}
