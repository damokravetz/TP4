package tp1.tp4;

import java.time.Year;
import java.util.Scanner;
import tp1.tp4.util.LectorEnteros;

public class Ejer5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LectorEnteros lector = new LectorEnteros(input);
		Alumno alu = null;
		int dni, anioNacimiento = 0;
		String nombreCompleto;

		while (alu==null) {
			// Pido DNI
			dni=lector.pedir("Ingresar Dni del alumno", alu.RANGO_NRO_DOCUMENTO.getLimiteSuperior(), alu.RANGO_NRO_DOCUMENTO.getLimiteInferior());
			// Completar

			// Pido nombre completo
			System.out.println("Ingresar nombre completo del alumno");
			nombreCompleto=input.nextLine();
			// Completar

			// Pido año de nacimiento
			System.out.println("Ingresar año de nacimiento del alumno");
			anioNacimiento=input.nextInt();
			// Completar
			try {
			alu=new Alumno(dni, nombreCompleto, anioNacimiento);
			} catch (IllegalArgumentException e) {
			alu=null;
			e.printStackTrace();
			}
		}
		input.close();
		System.out.println(alu.toString());
	}
}
