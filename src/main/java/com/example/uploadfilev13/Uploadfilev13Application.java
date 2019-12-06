package com.example.uploadfilev13;

import com.example.uploadfilev13.service.PicService;
import com.example.uploadfilev13.service.PicServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableSpringDataWebSupport
@EnableTransactionManagement
public class Uploadfilev13Application {

    public static void main(String[] args) {
        SpringApplication.run(Uploadfilev13Application.class, args);
    }
    @Bean
    public PicService picService(){
        return new PicServiceImpl();
    }
}
