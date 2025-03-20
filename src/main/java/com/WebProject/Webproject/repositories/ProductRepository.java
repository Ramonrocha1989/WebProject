package com.WebProject.Webproject.repositories;

import com.WebProject.Webproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {


}
