package com.kshitij.springbootpoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kshitij.springbootpoc.model.Brand;
import com.kshitij.springbootpoc.service.BrandsService;

@RestController
public class PocController {
    
    @Autowired
    private BrandsService brandsService;
    
    @RequestMapping(value="/",method=RequestMethod.GET)
    public List<Brand> defaultRequestHandler(){
       StringBuilder sb= new StringBuilder();
       sb.append("POST /add : To add a new Vehical");
       sb.append("\n");
       sb.append("GET /getAllBrands");
       return brandsService.getAllBrands();
    }
    @RequestMapping(value="/add",method=RequestMethod.POST)
    public String addBrand(@RequestBody Brand brand){
        //Brand brand=new Brand();
        System.out.println("Brand is "+brand.toString());
        //brand.setBrand_name("Maruti");
        //brand.setComments("Added via Spring Boot");
        brandsService.addBrand(brand);
        return "Added brand Successfully. Whay dont you test it.";
    }
}
