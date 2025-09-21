

/*Q2 - Create an abstract class Employee with: Fields: name, id. Abstract method: double calculateSalary().
Create two classes FullTimeEmployee and PartTimeEmployee extending Employee.
Override the calculateSalary() method based on:
Full-time: fixed monthly salary
Part-time: hours worked × rate per hour
Write a main method to display the salaries of different employees.*/

abstract class Employee {
    String name;
    int id;			

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(String name, int id, int hoursWorked, double ratePerHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("John", 101, 30000);
        Employee e2 = new PartTimeEmployee("Alice", 102, 80, 200);

        System.out.println("Salary of " + e1.name + ": " + e1.calculateSalary());
        System.out.println("Salary of " + e2.name + ": " + e2.calculateSalary());
    }
}
