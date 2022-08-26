package com.example.FanturAdmin.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Tarjeta")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int ID;
    @Column(name = "numeroTarjeta")
    private Long numeroTarjeta ;
    @Column(name = "vencimiento")
    private Date vencimiento ;
    @Column(name = "codSeguridad")
    private int codSeguridad ;
    @ManyToOne()
    @JoinColumn(name = "iDCliente")
    @JsonBackReference
    private Cliente cliente;

    public Tarjeta(int ID, Long numeroTarjeta, Date vencimiento, int codSeguridad,Cliente cliente) {
        this.ID = ID;
        this.numeroTarjeta = numeroTarjeta;
        this.vencimiento = vencimiento;
        this.codSeguridad = codSeguridad;
        this.cliente = cliente;
    }

    public Tarjeta(){
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(Long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public int getCodSeguridad() {
        return codSeguridad;
    }

    public void setCodSeguridad(int codSeguridad) {
        this.codSeguridad = codSeguridad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


}
