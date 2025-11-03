package dowhile;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea la variable num
		int num = 2;
		
		//Abrimos do
		do {
		
		//Imprime por pantalla el valor de num
		System.out.print(num + ",");
		
		//Incrementamos en 2 el valor de num
		num += 2;
		
		//Si num es menor o igual que 200 seguira repitiendose el bucle
		} while (num<=200);
		
		//Cierra el scanner
		sc.close();		
		
	}

}
