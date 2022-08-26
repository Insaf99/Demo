<<<<<<< HEAD
package com.example.FanturAdmin.Model;

import java.util.Date;

public class Partido {

    private Long ID;
    private String local;
    private String visitante;
    private Date fecha;
    private String estadio;

}
=======
package com.example.FanturAdmin.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Partido")
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "equipo1", nullable = false)
    private String local;
    @Column(name = "equipo2", nullable = false)
    private String visitante;
    @Column(name = "fecha", nullable = false)
    private Date fecha;
    @Column(name = "estadio", nullable = false)
    private String estadio;

    public Partido(int ID, String local, String visitante, Date fecha, String estadio) {
        this.ID = ID;
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.estadio = estadio;
    }

    public Partido(){ }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
}
>>>>>>> 7b47f8ca41d1496d222e625c2ab412e235c1e020
