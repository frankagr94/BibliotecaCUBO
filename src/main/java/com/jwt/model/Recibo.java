
package com.jwt.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "recibo")
public class Recibo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo_recibo;
    
     @OneToOne( fetch = FetchType.LAZY)//revisar estas relaciones
     @JoinColumn(name = "codigo_prestamo")
     private Prestamo prestamo;
     
     @OneToOne( fetch = FetchType.EAGER)//relacion one to one
     @JoinColumn(name = "codigo_empresa")
     private Empresa empresa;
  
     @Column(nullable = false)
     private Integer estatus;

    public Recibo() {
        super();
    }

    public Recibo(Integer codigo, Prestamo prestamo, Integer estatus) {
        this.codigo_recibo = codigo;
        this.prestamo = prestamo;
        this.estatus = estatus;
    }

    public Integer getCodigo() {
        return codigo_recibo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo_recibo = codigo;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Integer getEstatus() {
        return estatus;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }
    
}
