package com.example.FanturAdmin.Model;
<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.PersistenceException;
=======
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Paquete")
public class Paquete {

    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    @Column(name = "cantidadDePersonas", nullable = false)
    private int cantidadDePersonas;
    @Column(name = "seguroMedico", nullable = false)
    private double seguroMedico;
    @Column(name = "trasladoLocal", nullable = false)
    private String trasladoLocal;
    @Column(name = "cotizacion", nullable = false)
    private double cotizacion;
    @Column(name = "fechaLimite", nullable = false)
    private Date fechaLimite;
    private List<Entrada> entradas;
    //@Column(name = "IDHotel", nullable = false)
    private Hotel estadiaHotel;
    private List<Aereos> tipoViaje;
    //@Column(name = "IDCliente", nullable = false)
    //private Cliente clienteTitular;
    private List<Pagos> pagos;

    public Paquete(int ID, int cantidadDePersonas, double seguroMedico, String trasladoLocal, double cotizacion, Date fechaLimite, List<Entrada> entradas, Hotel estadiaHotel, List<Aereos> tipoViaje, List<Pagos> pagos) {
=======
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "cantidadDePersonas")
    private int cantidadDePersonas;
    @Column(name = "seguroMedico")
    private float seguroMedico;
    @Column(name = "trasladoLocal")
    private String trasladoLocal;
    @Column(name = "cotizacion")
    private float cotizacion;
    @Column(name = "fechaLimite")
    private Date fechaLimite;

    @ManyToOne()
    @JoinColumn(name = "iDHotel")
    private Hotel estadiaHotel;
    @ManyToOne()
    @JoinColumn(name = "iDCliente")
    private Cliente clienteTitular;
    //@OneToMany(mappedBy = "paquete", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<Pago> pagos;
    /*@OneToMany(mappedBy = "paquete", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Entrada> entradas;
    @OneToMany(mappedBy = "paquete", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Aereos> tipoViaje;
*/

    public Paquete(int ID, int cantidadDePersonas, float seguroMedico, String trasladoLocal, float cotizacion, Date fechaLimite, Hotel estadiaHotel, Cliente clienteTitular) {
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
        this.ID = ID;
        this.cantidadDePersonas = cantidadDePersonas;
        this.seguroMedico = seguroMedico;
        this.trasladoLocal = trasladoLocal;
        this.cotizacion = cotizacion;
        this.fechaLimite = fechaLimite;
<<<<<<< HEAD
        this.entradas = entradas;
        this.estadiaHotel = estadiaHotel;
        this.tipoViaje = tipoViaje;
        //this.clienteTitular = clienteTitular;
        this.pagos = pagos;
    }

=======
        this.estadiaHotel = estadiaHotel;
        this.clienteTitular = clienteTitular;
    }

    public Paquete(){ }

>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public void setCantidadDePersonas(int cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }

<<<<<<< HEAD
    public double getSeguroMedico() {
        return seguroMedico;
    }

    public void setSeguroMedico(double seguroMedico) {
=======
    public float getSeguroMedico() {
        return seguroMedico;
    }

    public void setSeguroMedico(float seguroMedico) {
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
        this.seguroMedico = seguroMedico;
    }

    public String getTrasladoLocal() {
        return trasladoLocal;
    }

    public void setTrasladoLocal(String trasladoLocal) {
        this.trasladoLocal = trasladoLocal;
    }

<<<<<<< HEAD
    public double getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(double cotizacion) {
=======
    public float getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(float cotizacion) {
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
        this.cotizacion = cotizacion;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

<<<<<<< HEAD
    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

=======
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
    public Hotel getEstadiaHotel() {
        return estadiaHotel;
    }

    public void setEstadiaHotel(Hotel estadiaHotel) {
        this.estadiaHotel = estadiaHotel;
    }

<<<<<<< HEAD
    public List<Aereos> getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(List<Aereos> tipoViaje) {
        this.tipoViaje = tipoViaje;
    }
/*
=======
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
    public Cliente getClienteTitular() {
        return clienteTitular;
    }

    public void setClienteTitular(Cliente clienteTitular) {
        this.clienteTitular = clienteTitular;
    }
<<<<<<< HEAD
*/
    public List<Pagos> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pagos> pagos) {
        this.pagos = pagos;
    }
=======
/*
    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    public List<Aereos> getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(List<Aereos> tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

 */
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
}