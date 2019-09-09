package tp1.ejercicio6;

import java.util.Arrays;
public class Rubro {

	
	private String  nombreRubro;
	private double [] importes;
	
	public Rubro () {
		 this.nombreRubro="";
		   
	}
	
	public Rubro (String nombre) {
		
    this.nombreRubro=nombre;
    inicializarGastos();
    
		
		
	}

	
	
	/*
	Es el constructor. Recibe el nombre o descripción del rubro. Debe inicializar el
	arreglo de importes.*/

	/* 
Inicializa el arreglo de importes.
*/
private void inicializarGastos () {
	importes = new double [Mes.values().length];
	
}

/*
Acumula el importe en la posición correspondiente al mes indicado.*/

public void agregarGasto(Mes mes, double importe) {
	
	int i=0;
	while (i<Mes.values().length ) {
		
		if ((Mes.values()[i].name().equals(mes))) {
			
			importes [i]=importe;
			
			
		}
		i++;
		
	}
	
}


/*
Devuelve el nombre del Rubro.*/
public String getNombre() {
	
	return nombreRubro;
}


/*
Devuelve el importe acumulado de gastos para el mes indicado*/

public double getTotalGastos(Mes mes) {
	
	double gastosTotales=0;
	int i=0;
	while (i<Mes.values().length) {
		if ((Mes.values()[i].name().equals(mes))) {
			
		gastosTotales=importes[i];
		}
		i++;
	}
	
	return gastosTotales;
}





public String getNombreRubro() {
	return nombreRubro;
}

public void setNombreRubro(String nombreRubro) {
	this.nombreRubro = nombreRubro;
}

public double[] getImportes() {
	return importes;
}

public void setImportes(double[] importes) {
	this.importes = importes;
}




//public void agregarGastos(Mes mes, double importe) {
//	
//	int i =0;
//	
//	while (){
//		
//		if ()
//		
//		
//		
//		i++;
//	}
//	
//}
//
//
//public String getNombreRubro() {
//	
//	return nombreRubro;
//}

}
