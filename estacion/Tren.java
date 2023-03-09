package com.cursoceat.estacion;

import java.util.Arrays;

public class Tren {
	Locomotora locomotora;//objeto
	Vagon []vagones;//objeto
	Maquinista responMaqui;//objeto
	private int numVagones;
	public Tren(Locomotora locomotora, Maquinista responsable) {
		super();
		this.locomotora = locomotora;
		this.responMaqui = responsable;
		vagones=new Vagon[5];//maximo vagones
		this.numVagones=0;//inicio de cantidad de vagones
	}
	public void agregarVagon(int cargaMaxima,int cargaActual, String mercancia) {
		if (this.numVagones>=5) {
			System.err.println(" No se pueden enganchar mas vagones ");
		}else {
			Vagon v=new Vagon(numVagones,cargaMaxima,cargaActual,mercancia);//aqui creo un vagon
			vagones [numVagones]= v;//el objeto v (nuevo lo añado al array)
		this.numVagones++;
		
			
		}
	
		
		
	}
	public void mostrarTren() {
		System.out.println("El tren tiene "+ numVagones + " vagones ");
		System.out.println("Los vagones tienen: ");
		
		
		for (Vagon va:vagones) {
			if (va==null) {
				break;
			}else {
				
			
			System.out.println(" Carga Actual :" +va.getCargaActual());
			System.out.println(" Carga Maxima :" +va.getCargaMaxima());
			System.out.println(" Mercancia : " +va.getMercancia());
			System.out.println(" Maquinista :" + responMaqui.getNombre());
			System.out.println(" Matricula de la Locomotora :" +locomotora.getMatricula());
	}
	
	}
	}

}
