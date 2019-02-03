package com.etiya.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.entities.Users;


public interface UserRepository extends JpaRepository<Users,Integer>{

}
