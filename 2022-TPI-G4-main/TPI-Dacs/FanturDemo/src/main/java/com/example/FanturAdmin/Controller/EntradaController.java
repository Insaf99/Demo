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

import com.example.FanturAdmin.Model.Entrada;
import com.example.FanturAdmin.Dao.EntradaDao;


@RestController
<<<<<<< HEAD
@RequestMapping("/api/v4")
=======
@RequestMapping("/api/v6")
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
public class EntradaController {
    @Autowired
    private EntradaDao entradaDao;

    @GetMapping("/entradas")
    public List<Entrada> getAllEntradas() {
        return entradaDao.findAll();
    }

}