package com.codegym.springbootr;

import com.codegym.springbootr.service.ProductService;
import com.codegym.springbootr.service.ProductServiceIplm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootrApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootrApplication.class, args);
    }

    @Bean
    public ProductService productService(){
        return new ProductServiceIplm();
    }
}

