package tp1;

public class Atleta {

	
	 private String  nombre; 
	 private String numParticipante;
	 private float tiempo;
	 
	 public Atleta () {
		 
		 nombre = null;
		 numParticipante=null;
		 tiempo=0;
	 }
	 
	 public Atleta (String nombre, String numParticipante, float tiempo) {
		 this.setNombre(nombre);
		 this.setNumParticipante(numParticipante);
		 this.setTiempo(tiempo);
	 }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumParticipante() {
		return numParticipante;
	}

	public void setNumParticipante(String numParticipante) {
		this.numParticipante = numParticipante;
	}

	public float getTiempo() {
		return tiempo;
	}

	public void setTiempo(float tiempo) {
		this.tiempo = tiempo;
	}
	 
	 
}
