package Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);

        Product product = applicationContext.getBean("getProduct", Product.class);
        System.out.println(product);
    }
}
