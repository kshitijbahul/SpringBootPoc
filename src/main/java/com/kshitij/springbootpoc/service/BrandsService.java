package com.kshitij.springbootpoc.service;

import java.util.List;

import com.kshitij.springbootpoc.model.Brand;

public interface BrandsService {
    void addBrand(Brand brand);
    void removeBrand(Brand brand);
    void updateBrand(Brand brand);
    List<Brand> findBrand(String brandName);
	List<Brand> getAllBrands();
}
