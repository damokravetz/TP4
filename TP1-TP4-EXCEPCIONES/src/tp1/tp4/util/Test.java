package tp1.tp4.util;

import java.time.Year;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int nacimiento = 0;
		int fallecimiento=0;
		Scanner input = new Scanner(System.in);
		LectorEnteros le = new LectorEnteros(input);
		int anioActual = Year.now().getValue();
		
		nacimiento=le.pedir("ingresar fecha de nacimiento de una persona (año)", 1900, anioActual);
		RangoDeEnteros rango=new RangoDeEnteros(nacimiento, anioActual);
		fallecimiento=le.pedir("ingresar año de fallecimiento o -1 si aun vive");
		while(fallecimiento!=-1 && !rango.incluye(fallecimiento)) {
			System.out.println("Fallecimiento no valido, ingrese nuevamente");
			fallecimiento=le.pedir("ingresar año de fallecimiento o -1 si aun vive");
		}
		int edad=0;
		if(fallecimiento!=-1) {
			edad=fallecimiento-nacimiento;
			System.out.println("Edad de la persona: "+edad+", no vive");
		}else {
			edad=anioActual-nacimiento;
			System.out.println("Edad de la persona: "+edad+", vive");
		}
		
		

		// Completar
		
		
		
		input.close();
	}
}
