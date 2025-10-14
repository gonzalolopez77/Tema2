package diagramas;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos la variable num1, num2 y num3
		int num1;
		int num2;
		int num3;

		// La consola muestra que indiquemos un numero y el valor que le demos se
		// almacena en num1
		System.out.println("Indica un numero:");
		num1 = sc.nextInt();

		// La consola muestra que indiquemos un numero y el valor que le demos se
		// almacena en num2
		System.out.println("Indica otro numero:");
		num2 = sc.nextInt();

		// La consola muestra que indiquemos un numero y el valor que le demos se
		// almacena en num3
		System.out.println("Indica otro numero:");
		num3 = sc.nextInt();

		// Usamos if para que nos diga cual es mayor
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " es mayor");
		} else if (num2 > num3) {
			System.out.println(num2 + " es mayor");
		} else {
			System.out.println(num3 + " es mayor");
		}

		// Cierra el scanner
		sc.close();

	}

}
