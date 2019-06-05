package tp1.tp4.util;

import java.util.Scanner;

public class LectorEnteros {
	private static final String MENSAJE_ERROR_SCANNER_NULL = "Debe recibirse un Scanner.";
	private static final String MENSAJE_ERROR_RANGO_NULL = "El rango no debe ser null.";
	private static final String MENSAJE_CARGA_ENTERO = "Ingrese un numero entero cualquiera";
	private static final String MENSAJE_ERROR_CARGA = "Error en la carga! ";
	private static final String MENSAJE_FUERA_DE_RANGO = "El valor ingresado esta fuera del rango aceptable";

	private static final String MASCARA_MENSAJE_CARGA_ENTERO = "%s:";
	private static final String MASCARA_MENSAJE_RANGO = "%s(entre %d y %d):";
	private static final String MASCARA_MENSAJE_RANGO_CON_FIN = "%s (entre %d y %d, %d para abandonar la carga):";

	private Scanner scanner;

	private int cargar(String mensaje) {
		System.out.printf(MASCARA_MENSAJE_CARGA_ENTERO, mensaje);
		return Integer.parseInt(scanner.nextLine());
	}
	public LectorEnteros(Scanner scanner) throws ... {
		
			// Completar
				throw new IllegalArgumentException(MENSAJE_ERROR_SCANNER_NULL);
		}
		this.scanner = scanner;
	}

	public int pedir(String mensaje) throws...{
		int num = 0;
		boolean ok = false;
		// Completar
			
		return num;
	}

	public int pedir(String mensaje, RangoDeEnteros rangoValido) throws...{
		int num = 0;
		// Completar
		
		return num;
	}

	public int pedir(String mensaje, int limiteA, int limiteB)  throws... {
		// Completar
		
	}

	public int pedir(String mensaje, RangoDeEnteros rango, int valorFinCarga) throws... {
		int num = 0;
		// Completar
		return num;
	}
// OPCIONALES 
	public int pedir() {
		int num = 0;
		// Completar
		return num;
	}
	public int pedir(String mensaje, int limiteA, int limiteB, int valorFinCarga) throws... {
		// Completar
		return 
	}

	public int pedir(String mensaje, RangoDeEnteros rango, int valorFinCarga)throws... {
		int num = 0;
		// Completar
		return num;
	}
}
