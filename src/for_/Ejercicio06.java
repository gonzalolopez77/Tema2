package for_;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
				
		//Variable nota
		double nota = 0;
		
		// for: desde num hasta 5 de 1 en 1
		for(int cont = 1; cont <= 5; cont++) {
			//Hasta que no introduzcas un valor valido no sale del bucle
			do {
			System.out.println("Introduce una nota: ");
			nota = sc.nextDouble();
				if(nota < 0 || nota > 10) {
					System.out.println("Introduce un valor de 0 a 10");
				}
			} while(nota < 0 || nota > 10);
		}
		
		//Si nota es menor que 5 es suspenso y si es mayor aprobado
		if(nota < 5) {
			System.out.println("Hay algun suspenso");
		} else {
			System.out.println("No hay ningun suspenso");
		}
		
		//Cierra el scanner
		sc.close();			
		
	}

}
