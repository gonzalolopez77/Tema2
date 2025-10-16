package if_else;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos la variable num
		int num;

		// La consola muestra que indiquemos un numero y el valor que le demos se almacena en num
		System.out.println("Indica un numero:");
		num = sc.nextInt();
		
		// Usamos if para que nos diga cual es par o impar
		if (num % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}

		// Cierra el scanner
		sc.close();		
		
	}

}
