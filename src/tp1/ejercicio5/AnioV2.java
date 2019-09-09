package tp1.ejercicio5;

public class AnioV2 {

	private static final int ENERO = 31;
	private static final int FEBRERO = 28;
	private static final int MARZO = 31;
	private static final int ABRIL = 30;
	private static final int MAYO = 31;
	private static final int JUNIO = 30;
	private static final int JULIO = 31;
	private static final int AGOSTO = 31;
	private static final int SEPTIEMBRE = 30;
	private static final int OCTUBRE = 31;
	private static final int NOVIEMBRE = 30;
	private static final int DICIEMBRE = 31;

	private int[] dias;

	public AnioV2() {

		dias = new int[] { ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE,
				DICIEMBRE };

	}

	public String getNombreDelMes(int numeroMes) {

		String mes = null;

		for (int i = 0; i < Mes.values().length; i++) {

			if (i + 1 == numeroMes) {

			}
		}
		return mes;

	}

	public int diasTranscurridos(int numeroMes) {

		int cantDias = 0;

		int i = 0;

		if (numeroMes > 0 && numeroMes <= Mes.values().length) {

			while (i < numeroMes - 1) {

				cantDias += dias[i];
				i++;

			}
			return cantDias;
		} else {

			System.out.println("numero ingresado invalido");
		}

		return cantDias;
	}

	public int[] getDias() {
		return dias;
	}

	public void setDias(int[] dias) {
		this.dias = dias;
	}

}
