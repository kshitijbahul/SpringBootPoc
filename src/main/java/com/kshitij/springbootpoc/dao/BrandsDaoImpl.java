package com.kshitij.springbootpoc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kshitij.springbootpoc.model.Brand;
@Component
//@Repository
@Transactional
public class BrandsDaoImpl implements BrandsDao {
    @Autowired
    private SessionFactory sessionFactory;
    
    
    
    @Override
    public void addBrand(Brand brand) {
        Session session=sessionFactory.getCurrentSession();
        session.persist(brand);

    }

    @Override
    public void removeBrand(Brand brand) {
        Session session=sessionFactory.getCurrentSession();
        session.delete(brand);
    }

    @Override
    public void updateBrand(Brand brand) {
        Session session=sessionFactory.getCurrentSession();
        session.update(brand);

    }

    @Override
    public List<Brand> findBrand(String brandName) {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery("from Brand where brand_Name :brand_Name");
        query.setString("brand_Name", brandName);
        return query.list();

    }
    
    @Override
    public List<Brand> getAllBrands(){
    	Session session=sessionFactory.getCurrentSession();
    	Query query=sessionFactory.getCurrentSession().createQuery("from Brand ");
    	return query.list();  	
    }

}
