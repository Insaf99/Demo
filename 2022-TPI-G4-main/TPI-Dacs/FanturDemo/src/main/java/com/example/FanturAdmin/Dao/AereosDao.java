package com.example.FanturAdmin.Dao;

import com.example.FanturAdmin.Model.Aereos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AereosDao extends JpaRepository<Aereos, Long>{
}