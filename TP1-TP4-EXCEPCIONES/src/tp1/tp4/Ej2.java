package tp1.tp4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero = 0;

		System.out.println("La variable \"numero\" actualmente vale " + numero + ".");
		System.out.println("Ingrese un nuevo valor para \"numero\":");
		
		System.out.println(numero);
		try{
			numero=input.nextInt();
			input.nextInt();
		}catch(InputMismatchException e){
			System.out.println("error");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("error");
			e.printStackTrace();
		}
		System.out.println(numero);
		input.close();
		
	}

}
