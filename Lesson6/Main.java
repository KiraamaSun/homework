package Lesson6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        Student student1 = new Student("Иванов Иван", "ПИ-101", 2);
        student1.addGrade("Математика", 4);
        student1.addGrade("Физика", 5);
        student1.addGrade("Программирование", 4);

        Student student2 = new Student("Петров Петр", "ПИ-101", 2);
        student2.addGrade("Математика", 2);
        student2.addGrade("Физика", 3);
        student2.addGrade("Программирование", 2);

        Student student3 = new Student("Сидорова Анна", "ПИ-102", 3);
        student3.addGrade("Математика", 5);
        student3.addGrade("Физика", 4);
        student3.addGrade("Программирование", 5);

        Student student4 = new Student("Козлов Дмитрий", "ПИ-102", 3);
        student4.addGrade("Математика", 3);
        student4.addGrade("Физика", 3);
        student4.addGrade("Программирование", 3);

        Student student5 = new Student("Смирнова Елена", "ПИ-103", 1);
        student5.addGrade("Математика", 5);
        student5.addGrade("Физика", 5);
        student5.addGrade("Программирование", 5);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println();
        printAllStudents(students);

        System.out.println("\n");
        printStudents(students, 2);

        System.out.println("\n");
        printStudents(students, 3);

        System.out.println("\n");
        removePoorStudents(students);

        System.out.println("\n");
        printAllStudents(students);

        System.out.println("\n");
        promoteStudents(students);

        System.out.println("\n");
        printAllStudents(students);
    }

    public static void removePoorStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
                System.out.println("Удален студент: " + student.getName() + " (ср. балл: " +
                        String.format("%.2f", student.getAverageGrade()) + ")");
            }
        }
    }

    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                int newCourse = student.getCourse() + 1;
                student.setCourse(newCourse);
                System.out.println("Студент " + student.getName() + " переведен на " + newCourse + " курс");
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Студентов на " + course + " курсе нет");
        }
    }

    public static void printAllStudents(Set<Student> students) {
        if (students.isEmpty()) {
            System.out.println("Студентов нет");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
