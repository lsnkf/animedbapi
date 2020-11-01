package ru.vvdstudio.animedbapi.config;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JsonConfig {

    @Bean
    public Module getHibernateModule() {
        return new Hibernate5Module();
    }

    @Bean
    public Module getDateTimeModule() {
        return new JavaTimeModule();
    }

}
