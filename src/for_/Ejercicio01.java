package for_;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Variable num
		int num;
				
		// Le pedimos un número al usuario que se almacena en num
		System.out.println("Introduce un numero:");
		num = sc.nextInt();
				
		// for: desde 1 hasta num de 1 en 1
		for(int cont = 1; cont<= num; cont++) {
			System.out.println(cont);
		}
				
		//Cierra el scanner
		sc.close();
		
	}

}
