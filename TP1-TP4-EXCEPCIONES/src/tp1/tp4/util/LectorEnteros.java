package tp1.tp4.util;

import java.util.InputMismatchException;
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
	public LectorEnteros(Scanner scanner) throws IllegalArgumentException {
		
		if(scanner==null) {
			throw new IllegalArgumentException(MENSAJE_ERROR_SCANNER_NULL);
		}else {
			this.scanner = scanner;
		}
	}

	public int pedir(String mensaje) /*throws Exception*/{
		int num = 0;
		boolean ok = false;
		/*System.out.println(mensaje);
		num=scanner.nextInt();
		scanner.nextLine();
		return num;*/
		while (!ok) {
			try {
				System.out.println(mensaje);
				num=scanner.nextInt();
				ok=true;
			}catch(InputMismatchException e) {
				System.out.println("Numero invalido");
				e.printStackTrace();
				scanner.nextLine();
			}
		}
		return num;
	}

	public int pedir(String mensaje, RangoDeEnteros rangoValido) throws IllegalArgumentException{
		int num = 0;
		String msje;
		if(rangoValido==null||mensaje==null) {
			throw new IllegalArgumentException(MENSAJE_ERROR_RANGO_NULL);
		}else {
				if(mensaje=="") {
					msje=MENSAJE_CARGA_ENTERO;
				}else {
					msje=mensaje;
				}
				boolean ok = false;
				num=pedir(msje);
				ok=rangoValido.incluye(num);
				while(!ok) {
				System.out.println(MENSAJE_FUERA_DE_RANGO);
				num=pedir(msje);
				ok=rangoValido.incluye(num);
			    }
		}
		// Completar
		return num;
	}

	public int pedir(String mensaje, int limiteA, int limiteB)  throws IllegalArgumentException {
		// Completar
		
		RangoDeEnteros rango= new RangoDeEnteros(limiteA, limiteB);
		String msje=mensaje+" entre "+rango.getLimiteInferior()+" y "+rango.getLimiteSuperior();
		int num=0;
		num=pedir(msje, rango);
		return num;
	}
/*
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
	*/
}