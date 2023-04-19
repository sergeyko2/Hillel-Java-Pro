package hw32;

import java.util.List;

public interface StudentDao {

    boolean addStudent(Student student);

    boolean deleteStudent(int id);

    boolean updateStudent(Student student);

    Student findStudentById(int id);

    List<Student> getAllStudent();
}
