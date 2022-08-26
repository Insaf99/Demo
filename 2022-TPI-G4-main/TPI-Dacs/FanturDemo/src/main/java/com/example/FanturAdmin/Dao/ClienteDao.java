package com.example.FanturAdmin.Dao;

import com.example.FanturAdmin.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteDao extends JpaRepository<Cliente, Long>{
}