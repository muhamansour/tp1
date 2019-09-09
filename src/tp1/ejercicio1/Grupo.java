package tp1.ejercicio1;



	import java.util.ArrayList;

	public class Grupo {



	private String nombre;
	private ArrayList<String> integrantes;

	public Grupo (String nombre) {
	this.nombre = nombre;
	integrantes  = new ArrayList <String>();


	}


	public String getNombre() {
	return nombre;
	}


	public void setNombre(String nombre) {
	this.nombre = nombre;
	}

	public int getCantidadIntegrantes() {

		int cantidad = 0;

		for (int i=0; i< integrantes.size(); i++) {
		if (integrantes.get(i) != null) {
		cantidad++;
		}

		}

		return cantidad;
		}
	public void agregarIntegrantes(String nombreIntegrante) {

	int i =0;

	while (i < integrantes.size() && !(integrantes.get(i).equals(nombreIntegrante))) {
	i ++;

	}
	if (i == integrantes.size()) {
	integrantes.add(nombreIntegrante);
	}
	}


	public int obtenerPosicionIntegrante(String nombreIntegrante) {

	int i =0;

	while (i < integrantes.size() && integrantes.get(i).equals(nombreIntegrante)) {
	i ++;

	}
	if (i < integrantes.size()) {
	return i+1; // +1 para devolver la posicion en la colleccion para el usuario y evitar el 0 
	}else { 
	return i= -1;
	}
	}


	public String obtenerIntegrante( int posicion) {
	String encontrado = null;

	if (posicion < integrantes.size()  && posicion > 0 ) {

	encontrado = integrantes.get(posicion -1);
	}

	return encontrado;
	}

	
	public String buscarIntegrante (String nombreIntegrante) {
		
	String encontrado = null;
	int i=0;
	while (i< integrantes.size() && integrantes.get(i).equals(nombreIntegrante)) {
		i++;
		
	}
	if (i == integrantes.size()) {
		return encontrado; 
	}else {
		encontrado=nombreIntegrante;
		return encontrado;
	}
	
		
	}
	
	public String removerIntegrantes (String nombreIntegrante) {
		
		String removido= null;
		int i=0;
		
		while (i < integrantes.size() && integrantes.get(i).equals(nombreIntegrante)) {
			i++;
		}
if (i == integrantes.size()) {
	
	return removido;
}else {
	integrantes.remove(i);
	return removido=nombreIntegrante;
}		
	
	}
	
	public void mostrarIntegrantes() {
		
		System.out.println(integrantes.toString());
		
		
	}
	
	public void mostrar() {
		
		System.out.println(integrantes.toString());
	}
	
	public void vaciar() {
		integrantes.clear();
	}


	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + ", cantidad integrantes=" + integrantes.size()+1 + "nombre integrantes= "+ integrantes.toString()+"]";
	}
	
	
	}
	

