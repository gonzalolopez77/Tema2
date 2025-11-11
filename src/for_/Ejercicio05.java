package for_;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
				
		//Variable num, factorial
		int num;
		long factorial = 1;
		
		
		//Pide por consola que introduzcas un numero y lo almacena en numFactorizar
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		// for: desde num hasta 1 de 1 en 1
		for(int cont = num; cont >= 1; cont--) {
			System.out.print(cont);
			if(cont != 1) {
			System.out.print("*");
			}
			factorial *= cont;
		}
		
		//Imprimimos la suma
		System.out.println("= " + factorial);
		
		//Cierra el scanner
		sc.close();		
		
	}

}
