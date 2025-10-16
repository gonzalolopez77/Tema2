package if_else;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos la variable num
		double num;

		// La consola muestra que indiquemos un numero y el valor que le demos se almacena en num
		System.out.println("Indica un numero decimal:");
		num = sc.nextDouble();
		
		// Usamos if para que nos diga si es casi 0 o no
		if (num < 1 && num > -1 && num!= 0) {
			System.out.println("Es casi 0");
		} else {
			System.out.println("No es casi 0");
		}

		// Cierra el scanner
		sc.close();			
		
	}

}
