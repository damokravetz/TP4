package tp1.tp4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {
	public static int pedirNumeroEntero() {
		Scanner input = new Scanner(System.in);

		int numero = 0;
		boolean ok = false;
		while (!ok) {
			input.nextLine();
			try {
				System.out.println("Ingresar un numero");
				numero=input.nextInt();
				ok=true;
			}catch(Exception e) {
				System.out.println("error");
				e.printStackTrace();
				
			}
		}
		input.close();
		return numero;
	}
	
	public static void main(String[] args) {
		int numero = 0;
		numero = pedirNumeroEntero();
		System.out.println("El numero ingresado fue " + numero + ".");
	}



}
