package bucles02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
				
		// Número introducido por el usuario
		int num;

		// Variable para determinar si el número es primo
		boolean esPrimo = true;

		// Pido un número al usuario
		System.out.println("Introduzca un número entero positivo:");
		num = sc.nextInt();

		if (num > 0) {
			// Si es positivo entonces hacemos el estudio de si es primo

			if (num == 1) {
				esPrimo = false;
			} else {
				// Si es distinto de 1
				for (int cont = 2; cont < num ; cont++) {
					if (num % cont == 0) {
						esPrimo = false;
						System.out.println(cont);
					}
			}

			}
			System.out.println(esPrimo ? "El número es primo" : "El número no es primo");
		} else {
			System.out.println("El valor introducido debe ser positivo");
		}
		
		//Cierra el scanner
		sc.close();		
		
	}

}
