package com.jaden.tmall.dao;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.jaden.tmall.pojo.Category;

/**
 * CategoryDAO 类继承了 JpaRepository，就提供了CRUD和分页 的各种常见功能。
 */
public interface CategoryDAO extends JpaRepository<Category,Integer>{

}
