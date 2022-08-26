package com.example.FanturAdmin.Dao;

import com.example.FanturAdmin.Model.TarjetaDebito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TarjetaDebitoDao extends JpaRepository<TarjetaDebito, Long>{
}