package for_;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
				
		//Variable suma y contImpares
		int suma = 1;
		int contImpares = 1;
		
		// for: desde 1 hasta 10 de 1 en 1
		for(int cont = 1; cont<= 10; cont++) {
			contImpares +=2;
			suma += contImpares;
		}
		
		//Imprimimos la suma
		System.out.println("La suma es: " + suma);
		
		//Cierra el scanner
		sc.close();			
		
	}

}
