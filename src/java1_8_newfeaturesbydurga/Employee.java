package java1_8_newfeaturesbydurga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    String name;
    int eno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public Employee(String name, int eno){
        this.name = name;
        this.eno = eno;
    }

    public String toString(){
        return name+ "::" + eno;
    }
}

class Test{
    public static void main(String[] args) {
        Employee e = new Employee("chandan", 12);
        System.out.println(e);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jaish", 13));
        employees.add(new Employee("Amit", 14));
        employees.add(new Employee("Danish", 15));
        employees.add(new Employee("Ujjwal", 16));

        System.out.println(employees);

        Collections.sort(employees, (e1,e2) -> e1.name.compareTo(e2.name));
        System.out.println(employees);

        Collections.sort(employees, (e1,e2) -> (e1.eno<e2.eno ?1: e1.eno>e2.eno?-1:0));
        System.out.println(employees);

        Collections.sort(employees, (e1,e2) -> e1.name.compareTo(e2.name));
        System.out.println(employees);

        System.out.println(employees.get(1));

    }
}
