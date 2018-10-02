
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "inventariolibro")
public class InventarioLibro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigocota;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_libro")
    private Libro libro;
    
    @OneToOne(mappedBy = "inventariolibro", cascade = CascadeType.ALL,fetch = FetchType.LAZY, optional = false)
    private Prestamo prestamo;
    
    @Column(nullable = false)
    private Integer estatus;

    public InventarioLibro() {
        super();
    }

    public InventarioLibro(Integer codigocota, Libro libro, Integer estatus) {
        this.codigocota = codigocota;
        this.libro = libro;
        this.estatus = estatus;
    }

    public Integer getCodigocota() {
        return codigocota;
    }

    public void setCodigocota(Integer codigocota) {
        this.codigocota = codigocota;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Integer getEstatus() {
        return estatus;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }
    
    
    
    
    
}
