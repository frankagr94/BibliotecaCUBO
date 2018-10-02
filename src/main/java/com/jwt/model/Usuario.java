
package com.jwt.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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
@Table(name = "usuario")
public class Usuario implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo_usuario;
    @Column(unique = true, nullable = false)
    private String cedula;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(nullable = false)
    private String direccion;
    @Column(nullable = false)
    private String telefono;
    @Column(nullable = false)
    private String correo;
    @Column(nullable = false)
    private Integer codigorol;
    @Column(nullable = false)
    private Integer estatus;    
    
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "id_rol", nullable=false)
   private Rol rol;
   
   @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL,orphanRemoval = true)
   private List<Prestamo> prestamos = new ArrayList<>();
   
   
    public Usuario() {
        super();
    }

 public Usuario( Integer codigo,Integer codigorol,
                 String cedula ,String password,
                 String nombre,String apellido ,
                 String direccion,String telefono,
                 String correo,Integer estatus) 
 {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion= direccion;
        this.telefono= telefono;
        this.correo=correo;
        this.codigorol = codigorol;
        this.codigo_usuario = codigo;
        this.estatus = estatus;
        this.password = password;
        this.cedula= cedula;
    }   

    public Integer getEstatus() {
        return estatus;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getCodigorol() {
        return codigorol;
    }

    public void setCodigorol(Integer codigorol) {
        this.codigorol = codigorol;
    }

    public Integer getCodigo_usuario() {
        return codigo_usuario;
    }

    public void setCodigo_usuario(Integer codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
     public String getIdString() {
		if (this.codigo_usuario == null) {
			return null;
		}
		return this.codigo_usuario.toString().replaceAll("\\.", "");
	}
  
    
}
