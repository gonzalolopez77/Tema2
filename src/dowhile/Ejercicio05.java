package dowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea la variable num, ayuda, min y max
		String ayuda;
		int num = 1;
		int min = 1;
		int max = 100;
		
		//Usamos if para que si num es igual a numRandom imprima "Es igual" y termina el codigo
		if (num == numRandom) {

		} else {
		
		//Abrimos do
		do {			
		
			//
			Random aleatorio = new Random();
			int numRandom = aleatorio.nextInt(min, max);
			
			//
			if (num == numRandom) {
				
			}
			
		//Imprime por pantalla "Ayuda" y lo almacena ayuda
		System.out.println("Ayuda: ");
		ayuda = sc.nextLine().toUpperCase();
		
		//
		if (ayuda.equals("MAYOR")) {
			min = numRandom;
			min++;
			numRandom = aleatorio.nextInt(min, max);
			
		} else if (ayuda.equals("MENOR")) {
			max = numRandom;
			numRandom = aleatorio.nextInt(min, max);
			
		} else {
			System.out.println("Error");
		}
		
		//Si num es menor o igual que numMax seguira repitiendose el bucle
		} while (numRandom!=num);

		//
		System.out.println("Es igual");
		
		//Cierra el scanner
		sc.close();			
		
		} //Cierra else
	}

}
