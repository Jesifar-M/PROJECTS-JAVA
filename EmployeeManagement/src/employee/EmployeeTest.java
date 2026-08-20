package employee;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setName("Rahul");
        employee1.setId(101);
        employee1.setDepartment("HR");
        employee1.setSalary(35000.0);


        Employee employee2 = new Employee();

        employee2.setName("Anu");
        employee2.setId(102);
        employee2.setDepartment("IT");
        employee2.setSalary(45000.0);


        System.out.println("Employee 1");
        System.out.println("Name: " + employee1.getName());
        System.out.println("ID: " + employee1.getId());
        System.out.println("Department: " + employee1.getDepartment());
        System.out.println("Salary: " + employee1.getSalary());

        System.out.println();

        System.out.println("Employee 2");
        System.out.println("Name: " + employee2.getName());
        System.out.println("ID: " + employee2.getId());
        System.out.println("Department: " + employee2.getDepartment());
        System.out.println("Salary: " + employee2.getSalary());
    }
}