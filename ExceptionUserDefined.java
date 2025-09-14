class InvalidEmployeeid extends Exception {
    InvalidEmployeeid(String message) {
        super(message);
    }
}

class Employee {
    int empid;
    String name;

    Employee(int empid, String name) throws InvalidEmployeeid {
        if (empid <= 0) {
            throw new InvalidEmployeeid("Employee ID must be positive.");
        }
        this.empid = empid;
        this.name = name;
        System.out.println("Employee created: " + empid + ", " + name);
    }
}

public class ExceptionUserDefined {
    public static void main(String[] args) {
        try {
            Employee e1 = new Employee(101, "Rahul");
            Employee e2 = new Employee(-5, "Rohit");
        } catch (InvalidEmployeeid e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
