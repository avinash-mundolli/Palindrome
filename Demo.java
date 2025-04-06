// Person Class - The base class for all types of people in the school system
class Person {
    String name;
    int age;
    String address;

    // Constructor to initialize common fields
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display basic details (overridden by subclasses)
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

// Student Class - Subclass of Person, represents a student
class Student extends Person {
    String studentId;
    String grade;

    // Constructor to initialize fields specific to Student, and call the parent class constructor
    public Student(String name, int age, String address, String studentId, String grade) {
        super(name, age, address);  // Call the constructor of Person
        this.studentId = studentId;
        this.grade = grade;
    }

    // Overriding displayDetails to include student-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call the base class displayDetails
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade: " + grade);
    }

    // Method specific to Student
    public void study() {
        System.out.println("The student is studying.");
    }
}

// Teacher Class - Subclass of Person, represents a teacher
class Teacher extends Person {
    String employeeId;
    String subject;

    // Constructor to initialize fields specific to Teacher, and call the parent class constructor
    public Teacher(String name, int age, String address, String employeeId, String subject) {
        super(name, age, address);  // Call the constructor of Person
        this.employeeId = employeeId;
        this.subject = subject;
    }

    // Overriding displayDetails to include teacher-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call the base class displayDetails
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Subject: " + subject);
    }

    // Method specific to Teacher
    public void teach() {
        System.out.println("The teacher is teaching.");
    }
}

// Staff Class - Subclass of Person, represents a staff member
class Staff extends Person {
    String employeeId;
    String department;

    // Constructor to initialize fields specific to Staff, and call the parent class constructor
    public Staff(String name, int age, String address, String employeeId, String department) {
        super(name, age, address);  // Call the constructor of Person
        this.employeeId = employeeId;
        this.department = department;
    }

    // Overriding displayDetails to include staff-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call the base class displayDetails
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }

    // Method specific to Staff
    public void work() {
        System.out.println("The staff member is working.");
    }
}

public class Demo {
    public static void main(String[] args) {
        // Creating instances of each class and calling their methods
        Student student = new Student("John Doe", 16, "123 School St", "S12345", "A");
        Teacher teacher = new Teacher("Jane Smith", 35, "456 Teacher Lane", "T98765", "Math");
        Staff staff = new Staff("Mary Johnson", 40, "789 Admin Blvd", "ST56789", "Administration");

        // Display details for each person
        System.out.println("Student Details:");
        student.displayDetails();
        student.study(); // Specific method for Student
        System.out.println();  // Blank line for separation

        System.out.println("Teacher Details:");
        teacher.displayDetails();
        teacher.teach(); // Specific method for Teacher
        System.out.println();  // Blank line for separation

        System.out.println("Staff Details:");
        staff.displayDetails();
        staff.work(); // Specific method for Staff
    }
}
