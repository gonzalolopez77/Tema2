package diagramas;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos la variable nota
		int nota;

		// La consola muestra que indiquemos una nota
		System.out.println("Indica un numero:");
		nota = sc.nextInt();

		// Usamos if para saber si seria notable, insuficiente, etc
		if (nota < 0) {
			System.out.println("Pon un valor entero");
		} else if (nota < 3) {
			System.out.println("Muy insuficiente");
		} else if (nota < 5) {
			System.out.println("Insuficiente");	
		} else if (nota < 7) {
			System.out.println("Bien");
		} else if (nota < 9) {
			System.out.println("Notable");		
		} else if (nota <= 10) {
			System.out.println("Sobresaliente");
		} else if (nota > 10) {
			System.out.println("Pon un valor entre 0 y 10");			
				
			}

		// Cierra el scanner
		sc.close();		
		
	}

}
