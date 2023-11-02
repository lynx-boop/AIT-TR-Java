package homework.student;

import homework.student.model.Student;

public class UniversityAppl {
    public static void main(String[] args) {
        Student student1 = new Student(1, "John", "Wolley", 1992, "medicine");
        Student student2 = new Student(2, "Sandra", "Delly", 1994, "art");

        System.out.print(student1.getFirstName());
        student1.learn();
        System.out.print(student1.getFirstName());
        student1.exams();
        System.out.print(student1.getFirstName());
        student1.vacation();

        System.out.println();

        System.out.print(student2.getFirstName());
        student2.vacation();
        System.out.print(student2.getFirstName());
        student2.learn();
        System.out.print(student2.getFirstName());
        student2.exams();
    }
}
