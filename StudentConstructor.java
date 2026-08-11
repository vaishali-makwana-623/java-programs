// Program to demonstrate a constructor in Java

class StudentConstructor {

    String name;
    int age;

    // Constructor
    StudentConstructor(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {

        StudentConstructor student =
                new StudentConstructor("Vaishali", 20);

        student.displayDetails();
    }
}
