// Program to demonstrate inheritance in Java

class Person {

    String name = "Vaishali";

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {

    int rollNo = 101;

    void displayRollNo() {
        System.out.println("Roll No: " + rollNo);
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Student student = new Student();

        student.displayName();
        student.displayRollNo();
    }
}
