package com.example.FanturAdmin.Model;

import javax.persistence.*;
import java.util.Date;


@Entity
@PrimaryKeyJoinColumn(name="id")
public class TarjetaDebito extends Tarjeta{

    @Column(name = "saldo", nullable = false)
    private float saldo;

    public TarjetaDebito(int ID, Long numeroTarjeta, Date vencimiento, int codSeguridad, Cliente cliente, float saldo) {
        super(ID, numeroTarjeta, vencimiento, codSeguridad, cliente);
        this.saldo = saldo;
    }

    public TarjetaDebito(float saldo) {
        this.saldo = saldo;
    }

    public TarjetaDebito(){}

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
