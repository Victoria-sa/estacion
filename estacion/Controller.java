package com.cursoceat.estacion;


import java.util.ArrayList;

import com.cursoceat.estacion.Mecanico.ESPECIALIDAD;

public class Controller {

	public static void main(String[] args) {
		
		//crear un array para ira guardando cada objeto
	ArrayList<Empleado> misEmpleados= new ArrayList<Empleado>();
			
	Mecanico unMecanico=new Mecanico("JD", "21","7867",1000,ESPECIALIDAD.ELECTRICIDAD);
	
	misEmpleados.add(unMecanico);
	unMecanico.mostrarDatos();
	System.out.println(unMecanico.toString());
	Maquinista unMaquinista=new Maquinista("Felix","52","25695",1080,"Jefe de Seccion");
	unMaquinista.mostrarDatos();
	misEmpleados.add(unMaquinista);
	JefeEstacion unJefeEstacion=new JefeEstacion("Juana","06875666","587269658",1200.00);
	unJefeEstacion.mostrarDatos();
	misEmpleados.add(unJefeEstacion);
	JefeEstacion unJefeEstacion2=new JefeEstacion("Victoria","5865875","05397820",1500.00);
	misEmpleados.add(unJefeEstacion2);
	Maquinista unMaquinista2=new Maquinista("Mercedes","589658858","69823698",1800.00,"RRHH");
	misEmpleados.add(unMaquinista2);
	//muestro en este momemto lo que te
	for (Empleado e:misEmpleados) {
		e.mostrarDatos();
	}
	
//	***************
	System.out.println("**********Desde aqui ejecutamos maquinaria");
	Locomotora unaLocomotora=new Locomotora("06548M", 1500, 2025, unMecanico);
	Tren miTren=new Tren(unaLocomotora, unMaquinista);
	miTren.agregarVagon(30000, 15000, "Bombillas");	
	miTren.agregarVagon(30000, 16000, "Coches");
	miTren.agregarVagon(30000, 19000, "Coches");
	miTren.agregarVagon(30000, 20000, "Coches");
	miTren.agregarVagon(30000, 25000, "Coches");
//	miTren.agregarVagon(30000, 25000, "Coches");si se quita el comentario nos imprimira"No se pueden agregar mas
	//porque el array es de 5.
	
	miTren.mostrarTren();
	}
	

}