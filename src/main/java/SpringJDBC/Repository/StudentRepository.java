package SpringJDBC.Repository;

import SpringJDBC.Entity.Student;

import java.util.List;

public interface StudentRepository {
    int insert(Student student);
    int change(Student student);
    int delete(int studentId);
    Student getStudent(int studentId);
    List<Student>getAllStudents();
}
