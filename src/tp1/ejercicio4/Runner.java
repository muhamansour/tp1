package tp1.ejercicio4;

import java.util.Scanner;
public class Runner {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
//		En el programa principal mostrá cuántos días transcurrieron antes del comienzo del
//		año y qué día del año es el día de cumpleaños de cada integrante del grupo.
//		Para discutir en clase o a través del Aula Virtual: Si el método diasTranscurridos(..) es
//		usado una y otra vez, ¿hay alguna manera que evitar que el cálculo de los días
//		transcurridos se haga permanentemente? Si la hay, modificá la clase para mejorar su
//		performance
		
		Anio anio2019 = new Anio();
		
		MostrarPorPantalla("ingrese el numero del mes que quiere calcular");
       int  numero=input.nextInt();
		
      
		MostrarPorPantalla("el numero de dias transcurridos es "+  anio2019.diasTranscurridos(numero));
      
		
		MostrarPorPantalla("Ingrese la cantidad de integrantes del grupo");
		
		int cant=input.nextInt();
		input.nextLine();
		
		
		int i=0;
		
		
		while (i< cant) {
			
			MostrarPorPantalla("Ingrese el numero de mes de cumple");
			int mes=input.nextInt();
			input.nextLine();
			MostrarPorPantalla("Ingrese el numero de dia de cumple");
			int dia= input.nextInt();
			input.nextLine();
			i ++;
			
			anio2019.diasTranscurridos(mes);
			MostrarPorPantalla("han pasado un total de "+(anio2019.diasTranscurridos(numero)+dia));
		}
		
	
	}

	public static void MostrarPorPantalla(String msj) {
		System.out.println(msj);
		
	}
	
	
	
}
