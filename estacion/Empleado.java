package com.cursoceat.estacion;

public class Empleado {
	private static int id;
	protected String nombre;
	protected String dni;
	protected String telefono;
	protected double sueldo;
	private  int idLocal;
	
	public Empleado() {//se crea metodo vacio a traves del sourface
		asignarID();//ahora le asignamos a este metodo ID
	}
	public Empleado(String nombre, String dni, String telefono, double sueldo) {
		//se crea metodo con surface marcando todos los atributos
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.sueldo = sueldo;
		this.idLocal=asignarID();
	//o id++ seria igual
	}
	private static int asignarID() {
	//es unamanera de incrementar el id en cada registro
		return ++id;
	}
	
	static private int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	
	}
	public  void mostrarDatos() {
		System.out.println(" El id es: " + this.idLocal);
		System.out.println(" EL nombre seria " + this.nombre);
		System.out.println(" EL DNI seria " + this.dni);
		System.out.println(" EL Telefono seria " + this.telefono);
		System.out.println(" EL Sueldo seria " + this.sueldo);
	}
	

}
