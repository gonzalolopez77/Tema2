package diagramas;

import java.util.Scanner;

public class Ejercicio06 {

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
		
		//Usamos if para que ordene de manera ascendente los dos numeros
		if(num > num2) {
			System.out.println(num + " y " + num2);
		} else {
			System.out.println(num2 + " y " + num);
		}
		
		//Cierra el scanner
		sc.close();			
		
	}

}
