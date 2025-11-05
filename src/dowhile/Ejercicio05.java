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
		int min = 1;
		int max = 100;
		
		//Abrimos do
		do {			
		
			//Almacena un valor aleatorio a la variable numRandom y lo imprime
			Random aleatorio = new Random();
			int numRandom = aleatorio.nextInt(min, max);
			System.out.println(numRandom);
			
		//Imprime por pantalla "Ayuda" y lo almacena ayuda
		System.out.println("Ayuda: ");
		ayuda = sc.nextLine().toUpperCase();
		
		//Usamos un if para cuando indiquemos "mayor" cambie el valor minimo del valor aleatorio y que cuando pongamos "menor" cambie el valor maximo del valor aleatorio
		if (ayuda.equals("IGUAL")) {
			
		} else if (ayuda.equals("MAYOR")) {
			min = numRandom;
			min++;
			numRandom = aleatorio.nextInt(min, max);
			
		} else if (ayuda.equals("MENOR")) {
			max = numRandom;
			numRandom = aleatorio.nextInt(min, max);
			
		} else {
			System.out.println("Error");
		}
		
		//Si ayuda es igual a "IGUAL" sale del bucle
		} while (!ayuda.equals("IGUAL"));

		//Muestra por pantalla que el numero es igual
		System.out.println("Es igual");
		
		//Cierra el scanner
		sc.close();		
	}
}
