package diagramas;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos la variable num y num2
		int num;
		int num2;
		int suma;
		int resta;
		int multiplicacion;
		int division;
		
		//La consola muestra que indiquemos un numero y el valor que le demos se almacena en num 
		System.out.println("Indica un numero:");
		num = sc.nextInt();
		
		//La consola muestra que indiquemos otro numero y el valor que le demos se almacena en num2
		System.out.println("Indica otro numero:");
		num2 = sc.nextInt();
		
		//Hacemos las operaciones y las almacenamos en las variables
		suma = num + num2;
		resta = num - num2;
		multiplicacion = num * num2;		
		
		//Usamos if para que cuando num sea 0 muestre un error
		if(num2 == 0) {
			System.out.println("Error division");
		} else {
			System.out.println("Division: " + (division = num / num2));
		}
			
		//Imprime la suma
		System.out.println("Suma: " + suma + " Resta: " + resta + " Multiplicacion: " + multiplicacion);
		
		//Cierra el scanner
		sc.close();				
		
	}

}
