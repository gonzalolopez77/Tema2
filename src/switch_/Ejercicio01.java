package switch_;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos la variable nota
		int nota;
		
		//La consola nos pide nuestra nota, que se almacenara en la variable nota
		System.out.println("Indica tu nota: ");
		nota = sc.nextInt();
		
		//Utilizamos switch para que segun el valor de nota nos imprima una cosa y otra
		switch (nota) {
		case 0, 1, 2, 3, 4 -> System.out.println("Insuficiente");
		case 5 -> System.out.println("Suficiente");
		case 6 -> System.out.println("Bien");
		case 7, 8 -> System.out.println("Notable");
		case 9, 10 -> System.out.println("Sobresaliente");
		default -> System.out.println("El valor tiene que estar entre 0 y 10");
		}
		
		// Cierra el scanner
		sc.close();			
		}
		
	
	}

