package SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spELConfig/spelConfig.xml");

        Demo demo1 = applicationContext.getBean("demo", Demo.class);
        System.out.println(demo1);
    }
}
