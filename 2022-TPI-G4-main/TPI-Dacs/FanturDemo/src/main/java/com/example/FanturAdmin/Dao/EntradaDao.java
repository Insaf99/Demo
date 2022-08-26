package com.example.FanturAdmin.Dao;

import com.example.FanturAdmin.Model.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EntradaDao extends JpaRepository<Entrada, Long>{
}