package tp1.tp4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero = 0;
		System.out.println(numero);
		try{
			numero=Integer.parseInt(input.nextLine());
		}catch(NumberFormatException e){
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
