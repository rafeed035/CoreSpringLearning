import Entity.Student;
import Entity.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collectionconfig.xml");

        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);

        Student student2 = (Student) context.getBean("student2");
        System.out.println(student2);

        Student student3 = (Student) context.getBean("student3");
        System.out.println(student3);

        Teacher teacher1 = (Teacher) applicationContext.getBean("teacher1");
        System.out.println(teacher1);
    }
}
