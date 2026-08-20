package employee;

public class Employee {

    private String name;
    private int id;
    private String department;
    private double salary;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }
}