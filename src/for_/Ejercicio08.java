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
		int mayor;
		int menor;
		
		
		//Pide por consola que introduzcas un numero y lo almacena en numFactorizar
		System.out.println("Introduce un numero: ");
		numA = sc.nextInt();
		System.out.println("Introduce otro numero: ");
		numB = sc.nextInt();
		
		//Para almacenar el numero menor en menor y el numero mayor en mayor
		menor = Math.min(numA, numB);
		mayor = Math.max(numA, numB);
		
		// for: desde menor hasta mayor de 1 en 1
		for(int cont = menor; cont <= mayor; cont++) {
			System.out.print(cont);
			if(cont < mayor) {
				System.out.print(",");
			}
			}
			
		//Cierra el scanner
		sc.close();			
		
	}

}
