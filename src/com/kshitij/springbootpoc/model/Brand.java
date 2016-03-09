package com.kshitij.springbootpoc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity

public class Brand {
    @Id
    @GenericGenerator(name = "uuid-gen", strategy = "uuid")
    @GeneratedValue(generator = "uuid-gen")
    private String brand_Id;
    private String brand_Name;
    private String comments;
    /**
     * @return the brand_Id
     */
    public final String getBrand_Id() {
        return brand_Id;
    }
    
    /**
     * @return the brand_name
     */
    public final String getBrand_name() {
        return brand_Name;
    }
    /**
     * @param brand_name the brand_name to set
     */
    public final void setBrand_name(String brand_name) {
        this.brand_Name = brand_name;
    }
    /**
     * @return the comments
     */
    public final String getComments() {
        return comments;
    }
    /**
     * @param comments the comments to set
     */
    public final void setComments(String comments) {
        this.comments = comments;
    }
    
    
}
