package oop.inheritance_example1;

public class Student extends Person {
    private String studentId;
    private String classLabel;

    public Student(String name, int age, String gender, String studentId, String classLabel) {
        super(name, age, gender);
        this.studentId = studentId;
        this.classLabel = classLabel;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am a student and my class is " + classLabel + ".");
    }
}
