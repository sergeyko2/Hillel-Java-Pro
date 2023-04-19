package hw32;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    private static StudentDaoImpl studentDao = new StudentDaoImpl();

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student studentEdit;

        students.add(new Student("Serhii", "serg@serg.com"));
        students.add(new Student("Olga Pavelko", "sbcxbxg@sbxbxbx.com"));
        students.add(new Student("Roman Hrusch", "bcxfx@sbdndd.com"));
        students.add(new Student("Kseniia Kovalenko", "aaaaaa@bbbbbbb.com"));
        students.add(new Student("Leopard", "sdhdsg@hsdddd.com"));
        students.forEach(student -> studentDao.addStudent(student));

        studentEdit = studentDao.findStudentById(40);
        System.out.println("Find student by ID = 40: " + studentEdit);

        studentEdit.setEmail("kseniia@kovalenko.com");
        studentDao.updateStudent(studentEdit);
        System.out.println("Edit student: " + studentDao.findStudentById(studentEdit.getId()));

        students = studentDao.getAllStudent();
        System.out.println("\nAll students from DB:");
        students.forEach(System.out::println);

        studentDao.deleteStudent(40);
        students = studentDao.getAllStudent();
        System.out.println("\nAll students from DB after deleting one:");
        students.forEach(System.out::println);
    }
}
