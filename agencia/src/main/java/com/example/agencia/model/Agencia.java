package com.example.agencia.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="agencia")

public class Agencia {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer nit;


	@NotEmpty 
	private String nombre;

   
	@NotEmpty
	private int telefono; 
    
	
	@NotEmpty
	private String direccion;

	
    public Agencia() {
		
	}


    public Agencia(Integer nit, @NotEmpty String nombre, @NotEmpty int telefono, @NotEmpty String direccion) {
        this.nit = nit;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }


    public Integer getNit() {
        return nit;
    }


    public void setNit(Integer id) {
        this.nit = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getTelefono() {
        return telefono;
    }


    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
	

	
    
}
