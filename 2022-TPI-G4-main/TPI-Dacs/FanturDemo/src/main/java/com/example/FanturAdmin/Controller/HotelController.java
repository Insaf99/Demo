package com.example.FanturAdmin.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FanturAdmin.Model.Hotel;
import com.example.FanturAdmin.Dao.HotelDao;


@RestController
<<<<<<< HEAD
@RequestMapping("/api/v2")
=======
@RequestMapping("/api/v5")
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
public class HotelController {
    @Autowired
    private HotelDao hotelDao;

    @GetMapping("/hoteles")
    public List<Hotel> getAllHoteles() {
        return hotelDao.findAll();
    }

}