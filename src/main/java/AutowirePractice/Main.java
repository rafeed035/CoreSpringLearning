package AutowirePractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AutowireXmlDirectory/configAutowire.xml");

        Teacher teacher = (Teacher) applicationContext.getBean("teacher1");
        System.out.println(teacher);

        Course course = (Course) applicationContext.getBean("course");
        System.out.println(course);
    }
}
