package SpringJDBC;

import SpringJDBC.Config.JdbcConfigClass;
import SpringJDBC.Entity.Student;
import SpringJDBC.Repository.StudentRepository;
import SpringJDBC.RepositoryImplementation.StudentRepositoryImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class JdbcMain {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JdbcConfigClass.class);

        StudentRepositoryImplementation studentRepositoryImplementation = applicationContext.getBean("getStudentRepositoryImplementation", StudentRepositoryImplementation.class);

        //insert
//        Student student = new Student(2, "ahsan", "shakil", "dhaka");
//        int insertResult = studentRepositoryImplementation.insert(student);
//        System.out.println(insertResult);

//        //update
//        Student student1 = new Student();
//        student1.setStudentId(2);
//        student1.setFirstName("rafeed");
//        student1.setLastName("aumit");
//        int updateResult = studentRepositoryImplementation.change(student1);
//        System.out.println(updateResult);
//
//        //delete
//        int deleteResult = studentRepositoryImplementation.delete(2);
//        System.out.println(deleteResult);

        Student student2 = studentRepositoryImplementation.getStudent(2);
        System.out.println(student2);

        List<Student>studentList = studentRepositoryImplementation.getAllStudents();
        for(int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i).getStudentId() +
                    " " +
                    studentList.get(i).getFirstName() +
                    " " +
                    studentList.get(i).getLastName() +
                    " " +
                    studentList.get(i).getCity());
        }
    }
}
