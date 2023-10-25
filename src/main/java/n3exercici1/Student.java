package n3exercici1;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String course;
    private int grade;


    public Student(String name, int age, String course, int grade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getAge() == student.getAge() && getGrade() == student.getGrade() && Objects.equals(getName(), student.getName()) && Objects.equals(getCourse(), student.getCourse());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", grade=" + grade +
                '}';
    }
}
