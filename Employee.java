
public class Employee {

    int Emp_id;
    String Emp_name;

    Employee(int i, String name) {
        Emp_id = i;
        Emp_name = name;
    }

    Employee(Employee s2) {
        Emp_id = s2.Emp_id;
        Emp_name = s2.Emp_name;
    }

    void printInfo() {
        System.out.println("Details of Employee: " + Emp_id + " " + Emp_name);
    }

    public static void main(String[] args) {
        Employee m1 = new Employee(101, "Radhey");
        m1.printInfo(); 

        Employee copy = new Employee(m1);
        copy.Emp_id = 108;

        System.out.println("Details after changing the values: ");
        copy.printInfo();
        m1.printInfo();
        // Employee copy;
        // copy = m1;

        // copy.printInfo();
        // copy.Emp_id = 2;
        // copy.Emp_name = "Pal";
        // System.out.println("Details after change by copy: ");
        // copy.printInfo();
        // m1.printInfo();
    }
}
