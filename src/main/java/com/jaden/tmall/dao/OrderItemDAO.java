package com.jaden.tmall.dao;

import com.jaden.tmall.pojo.Order;
import com.jaden.tmall.pojo.OrderItem;
import com.jaden.tmall.pojo.Product;
import com.jaden.tmall.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer> {
    List<OrderItem> findByOrderOrderByIdDesc(Order order);
    //根据产品获得OrderItem
    List<OrderItem> findByProduct(Product product);

    //用户对应未生成订单的订单项
    List<OrderItem> findByUserAndOrderIsNull(User user);
}