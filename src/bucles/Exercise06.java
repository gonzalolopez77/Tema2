package bucles;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos las variables altura y alturaMaxima
		double altura;
		double alturaMaxima = 0;
		
		//Imprimimos por consola "Introduce una altura" y lo almacena en altura
		System.out.println("Introduce una altura: ");
		altura = sc.nextDouble();
		
		// Iguala alturaMaxima a altura para que tenga un valor inicial
		alturaMaxima = altura;
		
		//Abrimos un bucle para que cuando introduzcamos una altura y sea mayor que la alturaMaxima se cambie el valor y del que se saldra al introducir -1
		while (altura != -1) {
			if (altura > alturaMaxima) {
				alturaMaxima = altura;
			}
			System.out.println("Introduzca una altura: ");
			altura = sc.nextDouble();
		}
		
		//Abrimos un if para que si se empieza introduciendo el valor -1 de un error
		if (alturaMaxima != -1) {
			System.out.println("El arbol mas alto mide: " + alturaMaxima);
		} else {
			System.out.println("Introduce una altura valida");
		}
		
		//Cierra el scanner
		sc.close();		
		
	}

}
