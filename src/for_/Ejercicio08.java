package for_;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
				
		//Variable 
		int numA;
		int numB;
		
		//Pide por consola que introduzcas un numero y lo almacena en numFactorizar
		System.out.println("Introduce un numero: ");
		numA = sc.nextInt();
		System.out.println("Introduce otro numero: ");
		numB = sc.nextInt();
		
		//
		if(numA < numB) {
			// for: desde num hasta 1 de 1 en 1
			for(int cont = numA; cont <= numB; cont++) {
				System.out.print(cont);
				if(cont < numB) {
					System.out.print(",");
				}
			}
		} else {
			for(int cont = numB; cont <= numA; cont++) {
				System.out.print(cont);
				if(cont < numA) {
					System.out.print(",");
				}
			}
		}
		
		
		//Cierra el scanner
		sc.close();			
		
	}

}
