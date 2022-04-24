package finalproject.models.Employee;

/**
 *
 * @author Dimple Patel
 */
public class Employee {
    private String employeeName;
    private int empId;
    private static int count = 1;

    public Employee() 
    {
        empId = count;
        count++;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return employeeName; //To change body of generated methods, choose Tools | Templates.
    }
}
