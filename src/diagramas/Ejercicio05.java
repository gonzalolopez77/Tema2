package diagramas;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos la variable num y num2
		int num;
		
		//La consola muestra que indiquemos un numero y el valor que le demos se almacena en num
		System.out.println("Indica un numero:");
		num = sc.nextInt();	
		
		//Usamos if para que cuando num sea mayor o igual que 0 muestre que es positivo y si es menor que 0 muestre que es negativo
		if(num >= 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
		
		//Cierra el scanner
		sc.close();			
		
	}

}
