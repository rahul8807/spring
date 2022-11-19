package com.myapps.scheduler.configuration;

import net.javacrumbs.shedlock.core.LockProvider;
import net.javacrumbs.shedlock.provider.jdbctemplate.JdbcTemplateLockProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class AppConfiguration {

    @Bean
    public LockProvider lockProvider( DataSource dataSource ){
        return new JdbcTemplateLockProvider ( JdbcTemplateLockProvider.Configuration.builder ()
                .withJdbcTemplate ( new JdbcTemplate ( dataSource ) )
                .usingDbTime ()
                .build ()
        );

    }

}
