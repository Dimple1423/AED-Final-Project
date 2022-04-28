package HealthBuddy.models.Employee;

import java.util.ArrayList;

/**
 *
 * @author Dimple Patel
 */
public class EmployeeCatalog {
    private ArrayList<Employee> employeeCatalog;

    public EmployeeCatalog() {
        employeeCatalog = new ArrayList();
    }
    
    public ArrayList<Employee> getEmployeeCatalog() 
    {
        return employeeCatalog;
    }
    
    public Employee addEmployee(String empName)
    {
        Employee employee = new Employee();
        employee.setEmployeeName(empName);
        employeeCatalog.add(employee);
        return employee;
    }  
    
}
