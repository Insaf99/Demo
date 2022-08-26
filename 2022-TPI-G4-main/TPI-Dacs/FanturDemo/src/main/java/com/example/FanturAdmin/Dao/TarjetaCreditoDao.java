package com.example.FanturAdmin.Dao;

import com.example.FanturAdmin.Model.TarjetaCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TarjetaCreditoDao extends JpaRepository<TarjetaCredito, Long>{
}