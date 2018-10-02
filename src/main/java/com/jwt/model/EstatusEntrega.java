
package com.jwt.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "estatusentrega")
public class EstatusEntrega implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo_entrega;
    @Column(nullable = false)
    private String descripcion;
    @Column(nullable = false)
    private Integer estatus;
    
    @OneToOne
    @JoinColumn(name = "codigo_prestamo")
    private Prestamo prestamo;

    public EstatusEntrega() {
    }


    public EstatusEntrega(Integer codigo, String descripcion, Integer estatus) {
        this.codigo_entrega = codigo;
        this.descripcion = descripcion;
        this.estatus = estatus;
    }

    public Integer getCodigo() {
        return codigo_entrega;
    }

    public void setCodigo(Integer codigo) {
        this.codigo_entrega = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEstatus() {
        return estatus;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }
  
}
