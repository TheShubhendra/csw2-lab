package Assignment3;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private int mark;

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }


    public String getName() { return name; }
    public int getAge() { return age; }
    public int getMark() { return mark; }


    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setMark(int mark) { this.mark = mark; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
               mark == student.mark &&
               Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, mark);
    }

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", mark=" + mark +
               '}';
    }
}

public class Question4 {
    private static LinkedList<Student> students;



  
    public static void checkExistence(Student student) {
        if (students.contains(student)) {
            System.out.println("The student exists in the list.");
        } else {
            System.out.println("The student does not exist in the list.");
        }
    }


    public static void removeStudent(Student student) {
        if (students.remove(student)) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }



    public static void main(String[] args) {
		students = new LinkedList<Student>();
		

        Scanner scanner = new Scanner(System.in);

        students.add(new Student("Shubh", 22, 100));
        students.add(new Student("Not Shubh",98, 0));
        students.add(new Student("No one", 500, 101));
        System.out.println(students);

  
        System.out.println("Number of students in the list: " + students.size());

   
        System.out.println("Enter student details to check existence (name age mark):");
        String name = scanner.next();
        int age = scanner.nextInt();
        int mark = scanner.nextInt();
        Student student = new Student(name, age, mark);
        checkExistence(student);


        System.out.println("Enter student details to remove (name age mark):");
        name = scanner.next();
        age = scanner.nextInt();
        mark = scanner.nextInt();
        student = new Student(name, age, mark);
        removeStudent(student);

        scanner.close();
    }
}

