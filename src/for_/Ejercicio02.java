package for_;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Variable num y contMult
		int num;
		int contMult = 0;	
		
		// Le pedimos un número al usuario que se almacena en num
		System.out.println("Introduce un numero:");
		num = sc.nextInt();
				
		// for: desde 1 hasta num de 1 en 1
		for(int cont = 1; cont<= num; cont++) {
			if (cont%3 == 0) {
				contMult++;
			}
		}
		
		//Imprime por pantalla el contador de multiplos
		System.out.println("Hay" + contMult + "multiplos");
				
		//Cierra el scanner
		sc.close();		
		
	}

}
