<<<<<<< HEAD
package com.example.FanturAdmin.Model;
import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Aereos")
public class Aereos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    //private Cliente cliente;
    @Column(name = "asiento", nullable = false)
    private String asiento;
    @Column(name = "clase", nullable = false)
    private String clase; //TURISTA,PRIMERA_CLASE
    @Column(name = "precio", nullable = false)
    private double precio;
    @Column(name = "fecha", nullable = false)
    private Date fecha;
    //@Column(name = "IDPaquete", nullable = false)
    @ManyToOne
    @JoinColumn(name = "paquete_id")
    private Paquete paquete;

    public Aereos() {
    }

    public Aereos(Long ID, String asiento, String clase, double precio, Date fecha, Paquete paquete) {
        this.ID = ID;
        this.asiento = asiento;
        this.clase = clase;
        this.precio = precio;
        this.fecha = fecha;
        this.paquete = paquete;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

import java.util.Date;

@Entity
@Table(name = "Aereos")
public class Aereos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "asiento", nullable = false)
    private String asiento;
    @Column(name = "clase", nullable = false)
    private String clase; //TURISTA,PRIMERA_CLASE
    @Column(name = "precio", nullable = false)
    private float precio;
    @Column(name = "fecha", nullable = false)
    private Date fecha;
    @ManyToOne()
    @JoinColumn(name = "iDPaquete")
    @JsonBackReference
    private Paquete paquete;
    @ManyToOne()
    @JoinColumn(name = "iDCliente")
    @JsonBackReference
    private Cliente clienteTitular;

    public Aereos(int ID, String asiento, String clase, float precio, Date fecha, Paquete paquete, Cliente clienteTitular) {
        this.ID = ID;
        this.asiento = asiento;
        this.clase = clase;
        this.precio = precio;
        this.fecha = fecha;
        this.paquete = paquete;
        this.clienteTitular = clienteTitular;
    }

    public Aereos(){ }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public Cliente getClienteTitular() {
        return clienteTitular;
    }

    public void setClienteTitular(Cliente clienteTitular) {
        this.clienteTitular = clienteTitular;
    }
}
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
