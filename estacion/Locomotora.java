package com.cursoceat.estacion;

public class Locomotora {
	private String matricula;
	private int potencia;
	private int anioFabricacion;
	Mecanico responsableMec;
	public Locomotora(String matricula, int potencia, int anioFabricacion, Mecanico responsableMec) {
		super();
		this.matricula = matricula;
		this.potencia = potencia;
		this.anioFabricacion = anioFabricacion;
		this.responsableMec = responsableMec;
	}
	public Locomotora() {
		super();
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getAnioFabricacion() {
		return anioFabricacion;
	}
	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	public Mecanico getResponsableMec() {
		return responsableMec;
	}
	public void setResponsableMec(Mecanico responsableMec) {
		this.responsableMec = responsableMec;
	}
	
	}
	


