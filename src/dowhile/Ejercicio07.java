package dowhile;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos la variable num1, num2 y operacion
		double num1;
		double num2;
		double operacion;
		String opcion;
		
		//Abrimos do
		do {
		
		//La consola nos pide dos numero, que se almacenara en la variable num1 y num2
		System.out.println("Indica un numero: ");
		num1 = sc.nextDouble();
		System.out.println("Indica otro numero: ");
		num2 = sc.nextDouble();
		
		//Aparece el menu por pantalla
		System.out.println("-Elige una opcion-");
		System.out.println("A. Suma");
		System.out.println("B. Resta");
		System.out.println("C. Multiplicacion");
		System.out.println("D. Division");
		System.out.println("E. Salir");
		opcion = sc.next().toUpperCase();
		
		//Utilizamos switch para que segun la opcion del menu haga una operacion u otra
		switch (opcion) {
		case "A" -> { 
			operacion= num1 + num2; 
			System.out.println("La suma es: " + operacion);
		}
		case "B" -> { 
			operacion= num1 - num2; 
			System.out.println("La resta es: " + operacion);
		}
		case "C" -> { 
			operacion= num1 * num2; 
			System.out.println("La multiplicacion es: " + operacion);
		}
		case "D" -> { 
			if (num2 == 0)
				System.out.println("No puede dividirse por 0");
			else {
			operacion= num1 / num2; 
			System.out.println("La division es: " + operacion);
			}
		}	
		case "E" -> { 
			System.out.println("Final");
		}
		default -> 
		System.out.println("Tienes que elegir entre A, B, C o D");
		}
		
		//Cuando opcion sea igual a E se sale del bucle
		} while(!opcion.equalsIgnoreCase("E"));
		
		// Cierra el scanner
		sc.close();			
		
	}

}
