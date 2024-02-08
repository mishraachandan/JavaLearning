package randomLearning;



import java.util.Arrays;
import java.util.List;

class Employee {
    private int employeeId;
    private int age;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

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
public class Test1 {
    public static void main(String[] args) {
        Object[] obj = null;

        Employee[] employee = new Employee[4];
        employee[0]  =  new Employee(1, 40, 30000, "John");
        employee[1] =   new Employee(2, 25, 35000, "Alice");
        employee[2] =  new Employee(3, 30, 25000, "Bob");
        employee[3] =  new Employee(4, 35, 40000, "Charlie");

        obj = employee;

        for(Object ob : obj){
            System.out.println(ob.toString());
        }

        var item = "String";
        System.out.println(item);

        var count = 0;
        System.out.println(count);
    }
}
