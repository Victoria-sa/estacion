package com.cursoceat.estacion;


public class Mecanico  extends Empleado{
	
	public enum ESPECIALIDAD { FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR}
	private ESPECIALIDAD especialidad;
	public Mecanico() {
		super();
		
	}

	public Mecanico(String nombre, String dni, String telefono, double sueldo, ESPECIALIDAD espe ) {
		super(nombre, dni, telefono, sueldo);
		this.especialidad=espe;
	}

	public ESPECIALIDAD getEspecialidad() {
		return especialidad;
	}
	@Override
	
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Especialidad"+ this.especialidad);
		
	}

	@Override
	public String toString() {
		return "Mecanico [especialidad=" + especialidad + ", nombre=" + nombre + ", dni=" + dni + ", telefono="
				+ telefono + ", sueldo=" + sueldo + "]";
	}
		
	
	
}

