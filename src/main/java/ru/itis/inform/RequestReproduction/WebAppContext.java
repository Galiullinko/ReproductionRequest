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
@ComponentScan(value = {"ru.itis.inform.RequestReproduction", "ru.itis.inform.RequestReproduction.controllers.dto.converters"})
public class WebAppContext extends WebMvcConfigurerAdapter {
    @Bean
    public DataSource dataSource() throws URISyntaxException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        String userName = "Galiullin_ko";
        String password ="c1337.ae";
        String dbUrlL = "jdbc:postgresql://localhost:5432/ReproductionRequest";

        dataSource.setUrl(dbUrlL);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        dataSource.setDriverClassName("org.postgresql.Driver");

        return dataSource;

    }
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
