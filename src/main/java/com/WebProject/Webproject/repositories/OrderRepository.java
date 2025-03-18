package com.WebProject.Webproject.repositories;

import com.WebProject.Webproject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {


}
