package com.example.FanturAdmin.Model;
<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
=======
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
import java.util.List;

@Entity
@Table(name = "Cliente")
public class Cliente {

    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.AUTO)
=======
    @GeneratedValue(strategy = GenerationType.IDENTITY)
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
    private Long ID;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellido", nullable = false)
    private String apellido;
    @Column(name = "nacionalidad", nullable = false)
    private String nacionalidad;
    @Column(name = "edad", nullable = false)
    private int edad;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "telefono", nullable = false)
    private String telefono;
<<<<<<< HEAD
    @Column(name = "tarjetaID", nullable = false)
    private int tarjetaID;
    private List<Paquete> paquetes;
    private List<Tarjeta> tarjetas;

    public Cliente(Long ID, String nombre, String apellido, String nacionalidad, int edad, String email, String telefono, int tarjetaID, List<Paquete> paquetes, List<Tarjeta> tarjetas) {
=======
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tarjeta> tarjetas;
    /*
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Paquete> paquetes;
*/
    public Cliente(Long ID, String nombre, String apellido, String nacionalidad, int edad, String email, String telefono, List<Tarjeta> tarjetas) {
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
<<<<<<< HEAD
        this.tarjetaID = tarjetaID;
        this.paquetes = paquetes;
        this.tarjetas = tarjetas;
=======
        this.tarjetas = tarjetas;
       // this.paquetes = paquetes;
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
    }

    public Cliente() {
    }

<<<<<<< HEAD

=======
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

<<<<<<< HEAD
    public int getTarjetaID() {
        return tarjetaID;
=======
    @JsonManagedReference
    //@JsonIgnore
    public List<Tarjeta> getTarjetas() {
        return tarjetas;
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
    }

    public void setTarjetas(List<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }
/*
    //@JsonManagedReference
    public List<Paquete> getPaquetes() {
        return paquetes;
    }

<<<<<<< HEAD

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + ID + ", firstName=" + nombre + ", lastName=" + apellido + ", emailId=" + email
                + "]";
=======
    public void setPaquetes(List<Paquete> paquetes) {
        this.paquetes = paquetes;
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
    }

 */
}
