package com.etiya.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.entities.Issues;

public interface IssuesRepository extends JpaRepository<Issues,Integer> {

}
