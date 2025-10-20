package switch_;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos la variable nota
		int dia;
		
		//La consola nos pide un numero, que se almacenara en la variable dia
		System.out.println("Indica un numero: ");
		dia = sc.nextInt();
		
		//Utilizamos switch para que segun el valor de dia nos imprima una cosa y otra
		switch (dia) {
		case 1 -> System.out.println("Lunes");
		case 2 -> System.out.println("Martes");
		case 3 -> System.out.println("Miercoles");
		case 4 -> System.out.println("Jueves");
		case 5 -> System.out.println("Viernes");
		case 6 -> System.out.println("Sabado");
		case 7 -> System.out.println("Domingo");
		default -> System.out.println("El valor tiene que estar entre 1 y 7");
		}
		
		// Cierra el scanner
		sc.close();			
		
	}

}
