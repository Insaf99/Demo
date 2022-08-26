package com.example.FanturAdmin.Dao;

import com.example.FanturAdmin.Model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HotelDao extends JpaRepository<Hotel, Long>{
}