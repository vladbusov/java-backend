package com.stalingraph.config;


import com.stalingraph.dao.UserDao;
import com.stalingraph.dao.UserDaoImpl;
import com.stalingraph.service.UserService;
import com.stalingraph.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/stalingraph?useSll=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("rootstalingraph228");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

    @Bean
    public UserDao getUserDao(){
        return new UserDaoImpl(getJdbcTemplate());
    }

    @Bean
    public UserService getUserService(){
        return new UserServiceImpl();
    }
}
