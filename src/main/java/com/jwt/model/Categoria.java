
package com.jwt.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo_categoria;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String descripcion;
     @Column(nullable = false)
    private Integer estatus;
     
   /*@OneToMany(mappedBy = "categoria",cascade = CascadeType.ALL,orphanRemoval = true)
   private List<Libro> libros = new ArrayList<>();*/

    public Categoria() {
        this.codigo_categoria = 0;
        this.estatus = 1;
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
