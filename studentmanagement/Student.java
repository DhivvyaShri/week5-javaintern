package studentmanagement;

public class Student {

    int studentId;
    String studentName;
    String course;

    public Student(int id, String name, String course) {
        this.studentId = id;
        this.studentName = name;
        this.course = course;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
    }
}