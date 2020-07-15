package com.jaden.tmall.service;

import java.util.List;

import com.jaden.tmall.pojo.Product;
import com.jaden.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.jaden.tmall.dao.CategoryDAO;
import com.jaden.tmall.pojo.Category;

/**
 * @Service 标记这个类是 Service类
 *
 * @Autowired 自动装配对象
 *
 */
@Service
public class CategoryService {
	@Autowired CategoryDAO categoryDAO;


	public Page4Navigator<Category> list(int start, int size, int navigatePages) {
		//Sort sort = new Sort(Sort.Direction.DESC, "id");
		Sort sort = new Sort(Sort.Direction.ASC, "id");
		Pageable pageable = new PageRequest(start, size,sort);
		Page pageFromJPA =categoryDAO.findAll(pageable);

		return new Page4Navigator<>(pageFromJPA,navigatePages);
	}
	public List<Category> list() {
    	Sort sort = new Sort(Sort.Direction.DESC, "id");
		return categoryDAO.findAll(sort);
	}

	public void add(Category bean) {
		categoryDAO.save(bean);
	}

	public void delete(int id) {
		categoryDAO.delete(id);
	}

	public Category get(int id) {
		Category c= categoryDAO.findOne(id);
		return c;
	}
	public void update(Category bean) {
		categoryDAO.save(bean);
	}

	public void removeCategoryFromProduct(List<Category> cs) {
		for (Category category : cs) {
			removeCategoryFromProduct(category);
		}
	}

	public void removeCategoryFromProduct(Category category) {
		List<Product> products =category.getProducts();
		if(null!=products) {
			for (Product product : products) {
				product.setCategory(null);
			}
		}

		List<List<Product>> productsByRow =category.getProductsByRow();
		if(null!=productsByRow) {
			for (List<Product> ps : productsByRow) {
				for (Product p: ps) {
					p.setCategory(null);
				}
			}
		}
	}
}
