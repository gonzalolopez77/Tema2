package dowhile;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea la variable num, multiplo y multiplicacion
		int num;
		int multiplo = 1;
		int multiplicacion;
		
		//Imprime por pantalla "Introduce un numero" y lo almacena en numMax
		System.out.println("Introduce un numero");
		num = sc.nextInt();
		
		//Abrimos do
		do {
		
		//Almacenamos en multiplicacion el valor de num * multiplo
			multiplicacion = num * multiplo;
		
		//
			System.out.println(num + "x" + multiplo + " = " + multiplicacion);
			
		//Incrementamos en 1 el valor de multiplo
			multiplo++;			
			
		//Si multiplo es menor o igual que 10 seguira repitiendose el bucle
		} while (multiplo<=10);
		
		//Cierra el scanner
		sc.close();			
		
	}

}
