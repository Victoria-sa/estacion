package com.cursoceat.estacion;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JefeEstacion extends Empleado {
	
	private LocalDateTime nombramiento;
	DateTimeFormatter formato1=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.SHORT);
	
	public JefeEstacion() {
	
		this.nombramiento = LocalDateTime.now();
	
	}


	public JefeEstacion(String nombre, String dni, String telefono, double sueldo ) {
		super(nombre, dni, telefono, sueldo);
		this.nombramiento = LocalDateTime.now();	
	
	}

	public LocalDateTime getNombramiento() {
		return nombramiento;
	}


	@Override
	public void mostrarDatos() {
		super.mostrarDatos();	
		System.out.println("Fecha de nombramiento: "+ this.nombramiento.format(formato1));
	}
	
 
 
 
 
}
