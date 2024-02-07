package java8InterviewCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int employeeId;
    private int age;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double salary;
    private String name;

    // Constructors, getters, and setters...

    public Employee(int employeeId, int age, double salary, String name) {
        this.employeeId = employeeId;
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    // Getters and Setters...
}

public class EmployeeSortingExample {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, 40, 30000, "John"),
                new Employee(2, 25, 35000, "Alice"),
                new Employee(3, 30, 25000, "Bob"),
                new Employee(4, 35, 40000, "Charlie")
        );

        List<Employee> filteredAndSortedEmployees = employees.stream()
                .filter(employee -> employee.getAge() > 35 && employee.getSalary() > 25000)
                .sorted((e1, e2) -> {
                    // First, sort by age
                    int ageComparison = Integer.compare(e1.getAge(), e2.getAge());
                    if (ageComparison != 0) {
                        return ageComparison;
                    }

                    // If age is the same, sort by salary
                    return Double.compare(e1.getSalary(), e2.getSalary());
                })
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Filtered and Sorted Employees: ");
        filteredAndSortedEmployees.forEach(employee ->
                System.out.println("ID: " + employee.getEmployeeId() +
                        ", Name: " + employee.getName() +
                        ", Age: " + employee.getAge() +
                        ", Salary: " + employee.getSalary()));
    }
}
