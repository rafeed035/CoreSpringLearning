package SpringJDBC.Config;

import SpringJDBC.RepositoryImplementation.StudentRepositoryImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfigClass {

    @Bean
    public DriverManagerDataSource getDriverManagerDataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/spring_core_db");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("rafeed2030");

        return driverManagerDataSource;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDriverManagerDataSource());
        return jdbcTemplate;
    }

    @Bean
    public StudentRepositoryImplementation getStudentRepositoryImplementation(){
        return new StudentRepositoryImplementation(getJdbcTemplate());
    }

}
