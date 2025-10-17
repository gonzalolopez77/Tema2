package if_else;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos la variable num
		int num;

		// La consola muestra que indiquemos un numero y el valor que le demos se almacena en num
		System.out.println("Indica un numero:");
		num = sc.nextInt();
		
		// Usamos if para calcular el numero de cifras del numero 
		if (num < 0 || num > 99999){
			System.out.println("Tiene que estar comprendido entre 0 y 99999");}
		 else if(num <10) {
			 System.out.println("1 cifra");
		 } else if (num < 100) {
			 System.out.println("2 cifras");
		 } else if (num < 1000) {
			 System.out.println("3 cifras");
		 } else if (num < 10000) {
			 System.out.println("4 cifras");
		 } else if (num < 100000) {
			 System.out.println("5 cifras");
		 }
		
		// Cierra el scanner
		sc.close();			
		
	}

}
