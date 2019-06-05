package tp1.tp4;

import java.util.Calendar;

public class Persona {
	private static final int VALOR_AUN_VIVE = -9999;
	private String nombreCompleto;
	private int anioNacimiento;
	private int anioFallecimiento;
	private int anioActual;

	/**
	 * Constructor para personas que aún viven.
	 *
	 * @param nombreCompleto
	 * @param anioNacimiento
	 */
	public Persona(String nombreCompleto, int anioNacimiento) {
		this(nombreCompleto, anioNacimiento, VALOR_AUN_VIVE);
	}

	/**
	 * Constructor para personas que ya han fallecido.
	 *
	 * @param nombreCompleto
	 * @param anioNacimiento
	 * @param anioFallecimiento
	 */
	public Persona(String nombreCompleto, int anioNacimiento, int anioFallecimiento) {
		setAnioActual();
		this.setNombreCompleto(nombreCompleto);
		this.setAnioNacimiento(anioNacimiento);
		this.setAnioFallecimiento(anioFallecimiento);
	}

	/**
	 * Guarda el anio actual para hacer las validaciones correspondientes a las
	 * fechas de nacimiento y fallecimiento.
	 */
	private void setAnioActual() {
		anioActual = Calendar.getInstance().get(Calendar.YEAR);
	}

	/**
	 * @param nombreCompleto
	 *            El nombre completo a asignar.
	 */
	private void setNombreCompleto(String nombreCompleto) {
				
		// Completar
	}

	/**
	 * @param anioNacimiento
	 *            El anio de nacimiento a asignar. No puede ser mayor al anio
	 *            anio actual.
	 */
	private void setAnioNacimiento(int anioNacimiento) {
		
		// Completar
		
		this.anioNacimiento = anioNacimiento;
	}

	/**
	 * @param anioFallecimiento
	 *            El anio de fallecimiento a asignar. No puede ser menor al anio
	 *            de nacimiento ni mayor al anio actual.
	 */
	public void setAnioFallecimiento(int anioFallecimiento) {
		
		// Completar
		
		this.anioFallecimiento = anioFallecimiento;
	}

	/**
	 * @return El nombre completo de la persona.
	 */
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	/**
	 * @return El anio de nacimiento de la persona
	 */
	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	/**
	 * @return El anio de fallecimiento de la persona. Si vale -9999 significa
	 *         que la persona aun vive.
	 */
	public int getAnioFallecimiento() {
		return anioFallecimiento;
	}

	public boolean vive() {
		return getAnioFallecimiento() == VALOR_AUN_VIVE;
	}

	@Override
	public String toString() {
		return "Persona [nombreCompleto=" + nombreCompleto + ", anioNacimiento=" + anioNacimiento
				+ ", anioFallecimiento=" + anioFallecimiento + "]";
	}
}