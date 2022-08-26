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

import com.example.FanturAdmin.Model.TarjetaCredito;
import com.example.FanturAdmin.Dao.TarjetaCreditoDao;


@RestController
@RequestMapping("/api/v3")
public class TarjetaCreditoController {
    @Autowired
    private TarjetaCreditoDao tarjetaCreditoDao;

    @GetMapping("/tarjetasCredito")
    public List<TarjetaCredito> getAllTarjetasCredito() {
        return tarjetaCreditoDao.findAll();
    }

}