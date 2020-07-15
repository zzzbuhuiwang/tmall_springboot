package com.jaden.tmall.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaden.tmall.pojo.Product;
import com.jaden.tmall.pojo.ProductImage;

public interface ProductImageDAO extends JpaRepository<ProductImage,Integer>{
    public List<ProductImage> findByProductAndTypeOrderByIdDesc(Product product, String type);

}
