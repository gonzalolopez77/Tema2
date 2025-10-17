package if_else;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribir un programa que pida al usuario
		//tres números enteros, y que muestre por pantalla 
		//si la suma de dos de esos números da como resultado el otro número.

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos la variable num1, num2 y num3
		int num1;
		int num2;
		int num3;

		// La consola muestra que indiquemos 3 numeros
		System.out.println("Indica un numero:");
		num1 = sc.nextInt();
		System.out.println("Indica otro numero:");
		num2 = sc.nextInt();
		System.out.println("Indica otro numero:");
		num3 = sc.nextInt();
		
		// Usamos if para calcular si la suma de dos de los numeros es igual al otro numero 
		if (num1 + num2 == num3) {
		System.out.println("El numero uno mas el numero dos es igual que numero tres " + num3);
		} else if (num2 + num3 == num1) {
			System.out.println("El numero dos mas el numero tres es igual que numero uno " + num1);
		} else if (num1 + num3 == num2) {
			System.out.println("El numero uno mas el numero tres es igual que numero dos " + num2);
		} else 
			System.out.println("La suma de dos de los numeros no es igual al otro numero");
		
		// Cierra el scanner
		sc.close();			
		
	}

}
