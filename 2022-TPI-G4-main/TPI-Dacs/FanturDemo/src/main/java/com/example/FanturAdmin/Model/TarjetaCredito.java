package com.example.FanturAdmin.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class TarjetaCredito extends Tarjeta{

    @Column(name = "montoMaximo", nullable = false)
    private float montoMaximo;

    public TarjetaCredito(int ID, Long numeroTarjeta, Date vencimiento, int codSeguridad, Cliente cliente, float montoMaximo) {
        super(ID, numeroTarjeta, vencimiento, codSeguridad, cliente);
        this.montoMaximo = montoMaximo;
    }

    public TarjetaCredito(float montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public TarjetaCredito(){}

    public double getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(float montoMaximo) {
        this.montoMaximo = montoMaximo;
    }
}
