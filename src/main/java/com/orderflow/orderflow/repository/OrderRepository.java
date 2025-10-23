package com.orderflow.orderflow.repository;

import com.orderflow.orderflow.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface OrderRepository extends JpaRepository<Order,Long>{
}
