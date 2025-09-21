class Student {
    private String name;
    private int roll_no;

    // Non-parameterized constructor
    public Student() {
        this.name = "";
        this.roll_no = 0;
    }

    // Parameterized constructor
    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getRollNo() { return roll_no; }
    public void setRollNo(int roll_no) { this.roll_no = roll_no; }

    public void display() {
        System.out.printf("Name: %s, Roll No: %d%n", name, roll_no);
    }
}

class StudentMain {
    public static void main(String[] args) {
        System.out.println("RAGHAV 24CSU168");
        Student s1 = new Student("Rahul", 29);
        s1.display();
    }
}
