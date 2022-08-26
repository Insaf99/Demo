package com.example.FanturAdmin.Dao;

import com.example.FanturAdmin.Model.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TarjetaDao extends JpaRepository<Tarjeta, Long>{
}