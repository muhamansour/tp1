package tp1.ejercicio4;

import java.util.Arrays;
public class Anio {
	
	
//	Ejercicio 4.
//	Creá la clase Anio, que tendrá un arreglo de Strings que contenga los nombres de
//	cada uno de los doce meses del año, y otro que contenga la cantidad de días de cada
//	uno (ignorá los años bisiestos) con los siguientes métodos:
//	● public String getNombreDelMes(int numeroMes)
//	Recibe el número de mes (entre 1 y 12) y devuelve el nombre del mes en
//	cuestión.
//	● public int diasTranscurridos(int numeroMes)
//	Recibe el número de mes y devuelve la cantidad de días transcurridos en el
//	año antes de comenzar el mes en cuestión.
//	En el programa principal mostrá cuántos días transcurrieron antes del comienzo del
//	año y qué día del año es el día de cumpleaños de cada integrante del grupo.
//	Para discutir en clase o a través del Aula Virtual: Si el método diasTranscurridos(..) es
//	usado una y otra vez, ¿hay alguna manera que evitar que el cálculo de los días
//	transcurridos se haga permanentemente? Si la hay, modificá la clase para mejorar su
//	performance.
	
	
	private static final int ENERO = 31;
	private static final int FEBRERO = 28;
	private static final int MARZO = 31;
	private static final int ABRIL = 30;
	private static final int MAYO = 31;
	private static final int JUNIO = 30;
	private static final int JULIO =31;
	private static final int AGOSTO = 31;
	private static final int SEPTIEMBRE = 30;
	private static final int OCTUBRE = 31;
	private static final int NOVIEMBRE = 30;
	private static final int DICIEMBRE = 31;
	
	
	
	
	
	

	private static final int MESES_DEL_ANIO=12; 
	
	
	private String [] meses = new String [MESES_DEL_ANIO];
	
	private int [] dias;
	
	
	public Anio () {
	meses = new String [] {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	
	
	
	dias = new int [] {ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE};
	
	
	}
	
	public String getNombreDelMes(int numeroMes) {
		
		String mes = null;
		
		for (int i=0; i<meses.length;i++) {
			
			if ( i+1 == numeroMes ) {
				
				mes = meses [i];
				
			}
		}
		return mes;
		
		
		
	}
	
	
	
	public int diasTranscurridos(int numeroMes) {
		
		int cantDias=0;
		
		int i=0;
		
		if (numeroMes>0 && numeroMes<=meses.length) {
			
		
		while (i< numeroMes-1) {
			
			cantDias += dias[i];
			i++;
	
		}
		return cantDias;
		}else {
			
			System.out.println("numero ingresado invalido");
		}
		
		return cantDias;
	}
	
	public String[] getMeses() {
		return meses;
	}

	public void setMeses(String[] meses) {
		this.meses = meses;
	}

	public int[] getDias() {
		return dias;
	}

	public void setDias(int[] dias) {
		this.dias = dias;
	}


	public static int getMesesDelAnio() {
		return MESES_DEL_ANIO;
	}
	
	
	
}
