package ru.itis.inform.RequestReproduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;
import java.net.URISyntaxException;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
@Configuration
@EnableWebMvc
@ComponentScan("ru.itis.inform.RequestReproduction")
public class WebAppContext extends WebMvcConfigurerAdapter {
    @Bean
    public DataSource dataSource() throws URISyntaxException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        String userName = "galiullin_ko";
        String password ="";
        String dbUrlL = "jdbc:postgresql://localhost:5432/department";

        dataSource.setUrl(dbUrlL);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);

        return dataSource;

    }
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
