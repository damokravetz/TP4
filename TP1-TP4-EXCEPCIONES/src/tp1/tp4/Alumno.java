package tp1.tp4;

import tp1.tp4.util.RangoDeEnteros;

public class Alumno extends Persona {
	public static final RangoDeEnteros RANGO_NRO_DOCUMENTO = new RangoDeEnteros(1000000, 999999999);
	private int numeroLegajo;

	public Alumno(int numeroLegajo, String nombreCompleto, int anioNacimiento) throws IllegalArgumentException{
		super(nombreCompleto, anioNacimiento);
		setNumeroLegajo(numeroLegajo);
	}

	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(int numeroLegajo) throws IllegalArgumentException{
		// Completar
		if(RANGO_NRO_DOCUMENTO.incluye(numeroLegajo)) {
			this.numeroLegajo = numeroLegajo;
		}else {
			throw new IllegalArgumentException("dni fuera de rango");
		}
	}
	@Override
	public String toString(){
		String out="[nombreCompleto="+getNombreCompleto()+", numeroLegajo="+getNumeroLegajo()+", anioNacimiento="+getAnioNacimiento()+"]";
		return out;
	}
}
