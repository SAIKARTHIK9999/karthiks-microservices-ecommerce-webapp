package com.karthiksTech.orderservice.repository;

import com.karthiksTech.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
