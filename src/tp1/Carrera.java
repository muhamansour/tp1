package tp1;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrera {
	private static Scanner input = new Scanner(System.in);
	
	
	
 private String nombre; 
 private int distanciaEnMetros;
 private int cantidadParticipantes;
 private float mejorTiempoEnSeg;
 private ArrayList <Atleta> ganadores; 
 private ArrayList <Atleta> participantes;
 
 
 public Carrera () {
	 
	 this.nombre=null;
	 this.distanciaEnMetros=0;
	 this.mejorTiempoEnSeg=0;
	 this.cantidadParticipantes=0;
	 ganadores = new ArrayList<Atleta> ();
	 participantes = new ArrayList<Atleta> ();
 }
 public Carrera (String nombre, int distancia, int cantidadParticipantes) {
	
	 this.nombre=nombre;
	 distanciaEnMetros=distancia;
	 this.cantidadParticipantes=cantidadParticipantes;
	 this.mejorTiempoEnSeg=0;
	 ganadores = new ArrayList <Atleta>();
	 participantes = new ArrayList<Atleta> ();
 }
 

 public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getDistanciaEnMetros() {
	return distanciaEnMetros;
}
public void setDistanciaEnMetros(int distanciaEnMetros) {
	this.distanciaEnMetros = distanciaEnMetros;
}
public int getCantidadParticipantes() {
	return cantidadParticipantes;
}
public void setCantidadParticipantes(int cantidadParticipantes) {
	this.cantidadParticipantes = cantidadParticipantes;
}
public float getMejorTiempoEnSeg() {
	return mejorTiempoEnSeg;
}
public void setMejorTiempoEnSeg(float mejorTiempoEnSeg) {
	this.mejorTiempoEnSeg = mejorTiempoEnSeg;
}


public void cargarParticipante(Carrera carrera) {
			
	int i=0;
	Atleta aux = new Atleta();
	String nombre;
	String id;
	int tiempo=0;
	
			while (i < carrera.cantidadParticipantes) {
				
				System.out.println("ingresa nombre del participante n° "+ i+1);
				nombre=input.nextLine();
				aux.setNombre(nombre);
				System.out.println("ingresa id del participante n° "+ i+1);
				id=input.nextLine();
				aux.setNumParticipante(id);
				System.out.println("ingresa tiempo del participante n° "+ i+1);
				tiempo=input.nextInt();
				aux.setTiempo(tiempo);
				
				participantes.add(aux);
				i++;
			}
			
			
	
}
 

public float calcularMejorTiempo(ArrayList <Atleta> participantes ) {

float mejor= participantes.get(0).getTiempo();

		for (int i=1; i<participantes.size();i++) {
			
			
			if (participantes.get(i).getTiempo()< mejor) {
				mejor=participantes.get(i).getTiempo();
				
			}
			
		}
return mejor;
}

public ArrayList <Atleta> ganadores (ArrayList <Atleta> listaParticipantes, float mejorTiempo) {

  for(int i=0; i<listaParticipantes.size(); i++) {
	  if(listaParticipantes.get(i).getTiempo()<=mejorTiempo) {
		  ganadores.add(listaParticipantes.get(i));
	  }
  }
	
	return ganadores;
}
public ArrayList<Atleta> getGanadores() {
	return ganadores;
}
public ArrayList<Atleta> getParticipantes() {
	return participantes;
}
}
