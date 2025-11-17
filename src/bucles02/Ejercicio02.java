package bucles02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
				
		// Número introducido por el usuario
		int num;
		
		//
		int contPrimos = 0;

		// Variable para determinar si el número es primo
		boolean esPrimo = true;
		
		//
		int divisor = 2;

		// Pido un número al usuario
		System.out.println("Introduzca un número entero positivo:");
		num = sc.nextInt();

		if (num > 0) {
			// Si es positivo entonces hacemos el estudio de si es primo

			if (num == 1) {
				esPrimo = false;
			} else {
				// 
				for (int cont = 2; cont <= num ; cont++) {
					divisor = 2;
					esPrimo = true;
					while (divisor < cont && esPrimo) {
						if(cont % divisor == 0) {
							esPrimo = false;
						}
						divisor++;
					}
					if(esPrimo) {
						contPrimos++;
					}
			}

			}

			System.out.println("El valor introducido debe ser positivo");
		}
		
		//
		System.out.println("Hay " + contPrimos);
		
		//Cierra el scanner
		sc.close();		
		
	}

}
