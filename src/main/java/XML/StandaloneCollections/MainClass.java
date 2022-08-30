package XML.StandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("StandaloneCollectionConfig/standaloneConfig.xml");

        Person person = (Person) applicationContext.getBean("person1");
        System.out.println(person);
        System.out.println(person.getFriendList().getClass().getName());

        Person person1 = (Person) applicationContext.getBean("person2");
        System.out.println("person1: " + person1);
        System.out.println(person1.getFriendList().getClass().getName());
    }
}
