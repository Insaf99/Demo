package com.example.FanturAdmin.Dao;

import com.example.FanturAdmin.Model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PartidoDao extends JpaRepository<Partido, Long>{
}