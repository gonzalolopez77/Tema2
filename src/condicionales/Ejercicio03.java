package condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Entrada: 11111111 || Resultado esperado: H || Resultado obtenido: H
		// Entrada: 1 || Resultado esperado: "Los DNI tienen 8 numeros" || Resultado obtenido: "Los DNI tienen 8 numeros"

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos la variable dni
		int dni;
		int letra = 0;

		// La consola nos pide nuestro DNI y lo almacena en dni
		System.out.println("Introduce tu DNI sin letra: ");
		dni = sc.nextInt();

		// Utilizamos if para que cuando el valor no sea un digito de 8 numeros de un
		// mensaje de error y cuando si sea un valor de 8 digitos ejecute un switch que
		// te asigne una letra u otra segun el valor
		if (dni > 9999999 && dni < 100000000) {
			letra = dni % 23;
			switch (letra) {
			case 0 -> System.out.println("T");
			case 1 -> System.out.println("R");
			case 2 -> System.out.println("W");
			case 3 -> System.out.println("A");
			case 4 -> System.out.println("G");
			case 5 -> System.out.println("M");
			case 6 -> System.out.println("Y");
			case 7 -> System.out.println("F");
			case 8 -> System.out.println("P");
			case 9 -> System.out.println("D");
			case 10 -> System.out.println("X");
			case 11 -> System.out.println("B");
			case 12 -> System.out.println("N");
			case 13 -> System.out.println("J");
			case 14 -> System.out.println("Z");
			case 15 -> System.out.println("S");
			case 16 -> System.out.println("Q");
			case 17 -> System.out.println("V");
			case 18 -> System.out.println("H");
			case 19 -> System.out.println("L");
			case 20 -> System.out.println("C");
			case 21 -> System.out.println("K");
			case 22 -> System.out.println("E");
			}
		} else {
			System.out.println("Los DNI tienen 8 numeros");
		}

		// Cierra el scanner
		sc.close();

	}

}
