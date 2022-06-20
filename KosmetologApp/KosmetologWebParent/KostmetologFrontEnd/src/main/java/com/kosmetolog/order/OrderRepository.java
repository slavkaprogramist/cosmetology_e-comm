package com.kosmetolog.order;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kosmetolog.entity.order.Order;


public interface OrderRepository extends JpaRepository<Order, Integer> {

}
