package com.example.FanturAdmin.Dao;

import com.example.FanturAdmin.Model.Paquete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaqueteDao extends JpaRepository<Paquete, Long>{
}