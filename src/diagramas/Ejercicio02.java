package diagramas;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos la variable edad
		int edad;
		
		//La consola muestra que indiquemos nuestra edad y el valor que le demos se almacena en edad
		System.out.println("Indica tu edad:");
		edad = sc.nextInt();
		
		//Usamos if para que cuando edad sea mayor o igual a 18 muestre que somos mayores de edad
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
		}
		
		//Cierra el scanner
		sc.close();		
	}
	

}
