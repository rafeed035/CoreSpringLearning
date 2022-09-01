package SpEL;

import SpEL.Student;
import SpEL.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("StereoConfig/stereoConfig.xml");

        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);

        Teacher teacher1 = applicationContext.getBean("teacher", Teacher.class);
        System.out.println(teacher1);
        System.out.println(teacher1.hashCode());

        Teacher teacher2 = applicationContext.getBean("teacher", Teacher.class);
        System.out.println(teacher2);
        System.out.println(teacher2.hashCode());

    }
}
