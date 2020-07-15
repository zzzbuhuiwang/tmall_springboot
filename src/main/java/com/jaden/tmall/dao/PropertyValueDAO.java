package com.jaden.tmall.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaden.tmall.pojo.Product;
import com.jaden.tmall.pojo.Property;
import com.jaden.tmall.pojo.PropertyValue;

public interface PropertyValueDAO extends JpaRepository<PropertyValue,Integer>{

    List<PropertyValue> findByProductOrderByIdDesc(Product product);
    PropertyValue getByPropertyAndProduct(Property property, Product product);

}