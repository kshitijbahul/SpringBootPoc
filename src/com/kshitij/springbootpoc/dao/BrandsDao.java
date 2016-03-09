package com.kshitij.springbootpoc.dao;

import java.util.List;

import com.kshitij.springbootpoc.model.Brand;

public interface BrandsDao {

    void addBrand(Brand brand);
    void removeBrand(Brand brand);
    void updateBrand(Brand brand);
    List<Brand> findBrand(String brandName);
}
