package tp1.ejercicio4;

import java.util.Scanner;
public class Runner {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
//		En el programa principal mostr� cu�ntos d�as transcurrieron antes del comienzo del
//		a�o y qu� d�a del a�o es el d�a de cumplea�os de cada integrante del grupo.
//		Para discutir en clase o a trav�s del Aula Virtual: Si el m�todo diasTranscurridos(..) es
//		usado una y otra vez, �hay alguna manera que evitar que el c�lculo de los d�as
//		transcurridos se haga permanentemente? Si la hay, modific� la clase para mejorar su
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
