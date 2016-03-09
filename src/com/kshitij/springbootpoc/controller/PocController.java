package com.kshitij.springbootpoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kshitij.springbootpoc.model.Brand;
import com.kshitij.springbootpoc.service.BrandsService;

@RestController
public class PocController {
    
    @Autowired
    private BrandsService brandsService;
    
    @RequestMapping("/")
    public String defaultRequestHandler(){
       
        return "Hello From the Spring boot Side! Kshitij Here ";
    }
    @RequestMapping(value="/add",method=RequestMethod.POST)
    public String addBrand(){
        Brand brand=new Brand();
        brand.setBrand_name("Maruti");
        brand.setComments("Added via Spring Boot");
        brandsService.addBrand(brand);
        return "Added brand Successfully. Whay dont you test it.";
    }
}
