
package com.jwt.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo_libro;   
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String autor;
    @Column(nullable = false)
    private String caracteristica;
    @Column(nullable = false)
    private String editorial;
    @Column(nullable = false)
    private Integer estatus;
    
    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_categoria")*/
    private Integer codigo_categoria;
    
    /*@OneToMany(mappedBy = "libro",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<InventarioLibro> inventario_libros = new ArrayList<>();*/

    public Libro() {
        this.estatus=1;
        this.codigo_libro=0;
    }

    /*public Libro(String nombre, String autor, String caracteristica, String editorial, Integer estatus, Integer categoria) {
        this.nombre = nombre;
        this.autor = autor;
        this.caracteristica = caracteristica;
        this.editorial = editorial;
        this.estatus = estatus;
        this.codigo_categoria = categoria;
    }*/

    public Integer getCodigo_libro() {
        return codigo_libro;
    }

    public void setCodigo_libro(Integer codigo_libro) {
        this.codigo_libro = codigo_libro;
    }

    public Integer getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(Integer codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Integer getEstatus() {
        return estatus;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }

    
    
}
