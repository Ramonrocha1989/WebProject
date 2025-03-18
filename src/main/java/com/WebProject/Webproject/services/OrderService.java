package com.WebProject.Webproject.services;

import com.WebProject.Webproject.entities.Order;
import com.WebProject.Webproject.repositories.OrderRepository;
import com.WebProject.Webproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj= repository.findById(id);
        return obj.get();
    }



}
