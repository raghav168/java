/*Q5 -  a base class Employee with fields: name, id. Create a subclass Manager that adds a field: department. Both classes should have a method displayDetails().
Write a program to create a Manager object and call displayDetails() to print all details.*/

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 101, "HR");
        m.displayDetails();
    }
}
