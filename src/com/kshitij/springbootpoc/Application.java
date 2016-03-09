package com.kshitij.springbootpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

import com.kshitij.springbootpoc.dao.BrandsDao;
import com.kshitij.springbootpoc.dao.BrandsDaoImpl;
import com.kshitij.springbootpoc.service.BrandsService;
import com.kshitij.springbootpoc.service.BrandsServiceImpl;

@SpringBootApplication
/*@EnableAutoConfiguration
@Configuration
@ComponentScan*/
public class Application {
    @Bean
    public BrandsService brandsService(){
        return new BrandsServiceImpl();
    }
    @Bean
    public BrandsDao brandsDao(){
        return new BrandsDaoImpl();
    }
    @Bean
    public HibernateJpaSessionFactoryBean sessionFactory() {
        return new HibernateJpaSessionFactoryBean();
    }
    
    public static void main(String[] args){
        ApplicationContext context=SpringApplication.run(Application.class, args);
        String[] allBeans=context.getBeanDefinitionNames();
        for(String eachBean:allBeans){
            System.out.println("The Bean name is : "+eachBean);
            
        }
    }
}
