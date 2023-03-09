package com.cursoceat.estacion;

public class Vagon {
private	int numId;
	int cargaMaxima;
	int cargaActual;
	String mercancia;
	
	public Vagon(int numId, int cargaMaxima, int cargaActual, String mercancia) {
		super();
		this.numId = numId;
		this.cargaMaxima = cargaMaxima;
		this.cargaActual = cargaActual;
		this.mercancia = mercancia;
	}

	public Vagon() {
		super();
	}

	public int getNumId() {
		return numId;
	}

	public void setNumId(int numId) {
		this.numId = numId;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public int getCargaActual() {
		return cargaActual;
	}

	public void setCargaActual(int cargaActual) {
		this.cargaActual = cargaActual;
	}

	public String getMercancia() {
		return mercancia;
	}

	public void setMercancia(String mercancia) {
		this.mercancia = mercancia;
	}

	
	
	

}
