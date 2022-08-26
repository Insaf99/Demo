<<<<<<< HEAD
package com.example.FanturAdmin.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Entrada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    @Column(name = "tipo", nullable = false)
    private String tipo;//POPULAR,PLATEA,PALCO

    //@Column(name = "IDPartido", nullable = false)
    private Partido partido;
    @Column(name = "fase", nullable = false)
    private int fase;
    @Column(name = "precio", nullable = false)
    private float precio;
    //@Column(name = "IDPaquete", nullable = false)
    private Paquete paquete;

    public Entrada(Long ID, String tipo, Partido partido, int fase, float precio, Paquete paquete) {
        this.ID = ID;
        this.tipo = tipo;
        this.partido = partido;
        this.fase = fase;
        this.precio = precio;
        this.paquete = paquete;
    }

    public Entrada(){
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public float getPrecio() { return precio; }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
}
=======
package com.example.FanturAdmin.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "Entrada")
public class Entrada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Column(name = "tipo", nullable = false)
    private String tipo;//POPULAR,PLATEA,PALCO
    @Column(name = "fase", nullable = false)
    private int fase;
    @Column(name = "precio", nullable = false)
    private float precio;
    @ManyToOne()
    @JoinColumn(name = "iDPartido")
    @JsonBackReference
    private Partido partido;
    @ManyToOne()
    @JoinColumn(name = "iDPaquete")
    private Paquete paquete;

    public Entrada(){}

    public Entrada(Long ID, String tipo, int fase, float precio, Partido partido, Paquete paquete) {
        this.ID = ID;
        this.tipo = tipo;
        this.fase = fase;
        this.precio = precio;
        this.partido = partido;
        this.paquete = paquete;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
}
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
