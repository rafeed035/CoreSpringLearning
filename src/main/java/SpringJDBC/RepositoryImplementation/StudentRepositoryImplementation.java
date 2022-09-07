package SpringJDBC.RepositoryImplementation;

import SpringJDBC.Entity.Student;
import SpringJDBC.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentRepositoryImplementation implements StudentRepository {

    private JdbcTemplate jdbcTemplate;

    public StudentRepositoryImplementation(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        String query = "insert into student (student_id, " +
                "student_first_name, " +
                "student_last_name, " +
                "student_city) " +
                "values(?, ?, ?, ?)";
        int rowsAffected = jdbcTemplate.update(query,
                student.getStudentId(),
                student.getFirstName(),
                student.getLastName(),
                student.getCity());
        return rowsAffected;
    }

    @Override
    public int change(Student student) {
        String query = "update student set student_first_name = ?, student_last_name = ? where student_id = ?";
        int updateResult = jdbcTemplate.update(query,
                student.getFirstName(),
                student.getLastName(),
                student.getStudentId());
        return updateResult;
    }

    @Override
    public int delete(int studentId) {
        String query = "delete from student where student_id = ?";
        int deleteResult = jdbcTemplate.update(query, studentId);
        return deleteResult;
    }

    @Override
    public Student getStudent(int studentId) {
        String query = "select * from student where student_id = ?";
        RowMapper<Student> rowMapper = new RowMapperImplementation();
        Student student = jdbcTemplate.queryForObject(query,rowMapper,studentId);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        String query = "select * from student";
        List<Student>studentList = jdbcTemplate.query(query, new RowMapperImplementation());
        return studentList;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
