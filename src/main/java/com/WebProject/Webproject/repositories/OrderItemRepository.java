package com.WebProject.Webproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WebProject.Webproject.entities.OrderItem;
import com.WebProject.Webproject.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
