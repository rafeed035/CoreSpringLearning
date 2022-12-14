package SpringORM;

import SpringORM.Enity.Student;
import SpringORM.Repository.StudentRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringOrmMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ORM/ormConfig.xml");
        StudentRepository studentRepository = applicationContext.getBean("studentRepository", StudentRepository.class);

        Student student = new Student(7,
                "Shahariar",
                "Fulbari");
        int r = studentRepository.insert(student);
        System.out.println(r);

        Student getStudent = studentRepository.getStudent(1);
        System.out.println(getStudent);

        List<Student>studentList = studentRepository.getAllStudents();
        for(int i =0; i< studentList.size(); i++){
            System.out.println(studentList.get(i).getStudentId());
            System.out.println(studentList.get(i).getStudentName());
            System.out.println(studentList.get(i).getStudentCity());
        }

        studentRepository.deleteStudent(5);

        Student student1 = new Student();
        student1.setStudentId(2);
        student1.setStudentName("Lipon");
        student1.setStudentCity("dhaka");
        studentRepository.updateStudent(student1);

    }
}
