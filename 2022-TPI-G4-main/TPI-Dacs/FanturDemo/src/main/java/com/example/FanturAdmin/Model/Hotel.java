package com.example.FanturAdmin.Model;
<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

=======
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
@Entity
@Table(name = "Hotel")
public class Hotel {

    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.AUTO)
=======
    @GeneratedValue(strategy = GenerationType.IDENTITY)
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
    private int ID;
    @Column(name = "Nombre", nullable = false)
    private String nombre;
    @Column(name = "estrellas", nullable = false)
    private int estrellas;
    @Column(name = "habitaciones", nullable = false)
    private String habitaciones;
    @Column(name = "pension", nullable = false)
    private boolean pension;
    @Column(name = "precioHabitaciones", nullable = false)
    private float precioHabitaciones;
<<<<<<< HEAD
    private List<Paquete> paquetes;


    public Hotel(int ID, String nombre, int estrellas, String habitaciones, boolean pension, float precioHabitaciones, List<Paquete> paquetes) {
        this.ID = ID;
        this.nombre = nombre;
        this.estrellas = estrellas;
        this.habitaciones = habitaciones;
        this.pension = pension;
        this.precioHabitaciones = precioHabitaciones;
        this.paquetes = paquetes;
    }

    public Hotel(){ }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(String habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean isPension() {
        return pension;
    }

    public void setPension(boolean pension) {
        this.pension = pension;
    }

    public float getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(float precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<Paquete> paquetes) {
        this.paquetes = paquetes;
    }
}
=======
   // @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<Paquete> paquetes;


    public Hotel(int ID, String nombre, int estrellas, String habitaciones, boolean pension, float precioHabitaciones) {
        this.ID = ID;
        this.nombre = nombre;
        this.estrellas = estrellas;
        this.habitaciones = habitaciones;
        this.pension = pension;
        this.precioHabitaciones = precioHabitaciones;
        //this.paquetes = paquetes;
    }

    public Hotel(){ }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(String habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean isPension() {
        return pension;
    }

    public void setPension(boolean pension) {
        this.pension = pension;
    }

    public float getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(float precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }
/*
    //@JsonManagedReference
    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

 */
}
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
