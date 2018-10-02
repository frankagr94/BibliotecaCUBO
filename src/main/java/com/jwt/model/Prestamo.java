
package com.jwt.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "prestamo")
public class Prestamo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo_prestamo;
    
   @OneToOne( fetch = FetchType.LAZY)
   @JoinColumn(name = "codigocota_inventario")
    private InventarioLibro inventariolibro;
   
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "codigo_usuario")
   private Usuario usuario;
   
   @OneToOne
   @JoinColumn(name = "codigo_entrega")
   private EstatusEntrega estatusentrega;
   
   @OneToOne(mappedBy = "prestamo", cascade = CascadeType.ALL,fetch = FetchType.LAZY, optional = false)
   private Recibo recibo;
   
   @Column(nullable=false) 
   @Temporal(TemporalType.DATE)
    private Date fecharetiro;
   @Column(nullable=false)
   @Temporal(TemporalType.DATE)
    private Date fechaentrega;
   @Column(nullable=false)
    private Integer estatus;

    public Prestamo() {
    }

    public Prestamo(Integer codigo, InventarioLibro inventariolibro, Usuario usuario, EstatusEntrega estatusentrega, Date fecharetiro, Date fechaentrega, Integer estatus) {
        this.codigo_prestamo = codigo;
        this.inventariolibro = inventariolibro;
        this.usuario = usuario;
        this.estatusentrega = estatusentrega;
        this.fecharetiro = fecharetiro;
        this.fechaentrega = fechaentrega;
        this.estatus = estatus;
    }

    public Integer getCodigo() {
        return codigo_prestamo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo_prestamo = codigo;
    }

    public InventarioLibro getInventariolibro() {
        return inventariolibro;
    }

    public void setInventariolibro(InventarioLibro inventariolibro) {
        this.inventariolibro = inventariolibro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public EstatusEntrega getEstatusentrega() {
        return estatusentrega;
    }

    public void setEstatusentrega(EstatusEntrega estatusentrega) {
        this.estatusentrega = estatusentrega;
    }

    public Date getFecharetiro() {
        return fecharetiro;
    }

    public void setFecharetiro(Date fecharetiro) {
        this.fecharetiro = fecharetiro;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
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
