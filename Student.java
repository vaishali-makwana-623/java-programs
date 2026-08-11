// Program to demonstrate a simple Java class and object

class Student {

    String name;
    int age;

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Vaishali";
        student.age = 20;

        student.displayDetails();
    }
}
