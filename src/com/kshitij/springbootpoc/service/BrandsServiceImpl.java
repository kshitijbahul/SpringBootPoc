package com.kshitij.springbootpoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kshitij.springbootpoc.dao.BrandsDao;
import com.kshitij.springbootpoc.model.Brand;
@Component
public class BrandsServiceImpl implements BrandsService {

    @Autowired
    private BrandsDao brandsDao;
    @Override
    public void addBrand(Brand brand) {
        brandsDao.addBrand(brand);

    }

    @Override
    public void removeBrand(Brand brand) {
        brandsDao.removeBrand(brand);

    }

    @Override
    public void updateBrand(Brand brand) {
      brandsDao.updateBrand(brand);

    }

    @Override
    public List<Brand> findBrand(String brandName) {
        // TODO Auto-generated method stub
        return brandsDao.findBrand(brandName);
    }

}
