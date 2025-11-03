package dowhile;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea la variable num
		int num = 1;
		
		//Abrimos do
		do {
		
		//Imprime por pantalla el valor de num
		System.out.print(num + ",");
		
		//Incrementamos en 1 el valor de num
		num++;
		
		//Si num es menor o igual que 20 seguira repitiendose el bucle
		} while (num<=20);
		
		//Cierra el scanner
		sc.close();
	}

}
