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

import com.example.FanturAdmin.Model.Tarjeta;
import com.example.FanturAdmin.Dao.TarjetaDao;


@RestController
@RequestMapping("/api/v2")
public class TarjetaController {
    @Autowired
    private TarjetaDao tarjetaDao;

    @GetMapping("/tarjetas")
    public List<Tarjeta> getAllTarjetas() {
        return tarjetaDao.findAll();
    }

}