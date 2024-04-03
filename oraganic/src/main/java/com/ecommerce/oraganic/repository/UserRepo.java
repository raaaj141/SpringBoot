package com.ecommerce.oraganic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.oraganic.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{

}