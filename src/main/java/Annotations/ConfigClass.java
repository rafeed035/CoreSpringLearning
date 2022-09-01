package Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

    @Bean
    public Product getProduct(){
        return new Product( 1, "abc", getCategory());
    }

    @Bean
    public Category getCategory(){
        return new Category(1, "watch");
    }

}
