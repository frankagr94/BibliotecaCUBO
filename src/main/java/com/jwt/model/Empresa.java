/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Frank
 */
@Entity
@Table(name = "empresa")
public class Empresa implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo_empresa;
    
    @OneToOne(mappedBy = "empresa", cascade = CascadeType.ALL,fetch = FetchType.LAZY, optional = false)
    private Recibo recibo;
    
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String rif;
    @Column(nullable = false)
    private String telefono;
    @Column(nullable = false)
    private Integer estatus;

    public Empresa() {
        this.codigo_empresa = 0;
        this.estatus = 1;
    }

    public Integer getCodigo_empresa() {
        return codigo_empresa;
    }

    public void setCodigo_empresa(Integer codigo_empresa) {
        this.codigo_empresa = codigo_empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    

    public Integer getEstatus() {
        return estatus;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
    }
    
    
    
}
