package diagramas;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos la variable num y num2
		int num;
		int num2;
		
		//La consola muestra que indiquemos un numero y el valor que le demos se almacena en num
		System.out.println("Indica un numero:");
		num = sc.nextInt();
		
		//La consola muestra que indiquemos un numero y el valor que le demos se almacena en num2
		System.out.println("Indica otro numero:");
		num2 = sc.nextInt();		
		
		//Usamos if para que cuando num sea mayor que num2 o num2 mayor que num muestre cual es mayor
		if(num > num2) {
			System.out.println(num + " es mayor que " + num2);
		} else {
			System.out.println(num2 + " es mayor que " + num);
		}
		
		//Cierra el scanner
		sc.close();			
		
	}

}
