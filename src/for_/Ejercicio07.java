package for_;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
				
		//Variable num
		int num;
		double raiz;
		
		//Pide que introduzcas un numero
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		raiz = Math.sqrt(num);
		
		if(num != 2 && num % 2 == 0) {
			System.out.println("No es primo");
		} else if(num == 2) {
			System.out.println("Es primo");
		}else {
		// for: desde 1 hasta 10 de 1 en 1
		for(int cont = 3; cont<= raiz; cont+=2) {
			if(num % cont == 0) {
				System.out.println("No es primo");
			} else {
				System.out.println("Es primo");
			}
		}
		}
		
		//Cierra el scanner
		sc.close();			
		
	}

}
