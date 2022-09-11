package SpringORM.Repository;

import SpringORM.Enity.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class StudentRepository {

    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public int insert(Student student){
        int insertResult = (Integer) hibernateTemplate.save(student);
        return insertResult;
    }

    public Student getStudent(int studentId){
        Student student = hibernateTemplate.get(Student.class, studentId);
        return student;
    }

    public List<Student> getAllStudents(){
        List<Student> studentList = hibernateTemplate.loadAll(Student.class);
        return studentList;
    }

    @Transactional
    public void deleteStudent(int studentId){
        Student student = hibernateTemplate.get(Student.class, studentId);
        hibernateTemplate.delete(student);
    }

    @Transactional
    public void updateStudent(Student student){
        hibernateTemplate.update(student);
    }
}
