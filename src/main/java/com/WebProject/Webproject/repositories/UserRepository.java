package com.WebProject.Webproject.repositories;

import com.WebProject.Webproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
