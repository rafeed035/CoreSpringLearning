package SpringJDBC.RepositoryImplementation;

import SpringJDBC.Entity.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImplementation implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setStudentId(rs.getInt("student_id"));
        student.setFirstName(rs.getString("student_first_name"));
        student.setLastName(rs.getString("student_last_name"));
        student.setCity(rs.getString("student_city"));
        return student;
    }
}
