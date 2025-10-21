package condicionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Entrada: -1 || Resultado esperado: 1 || Resultado obtenido: 1
		//Entrada: 1 || Resultado esperado: 1 || Resultado obtenido: 1
		
		// Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos la variable num
		int num;
		int valorAbsoluto;
		
		//La consola nos pide el valor de un numero que se almacena en num
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		//Usamos el ternario para calcular el valor absoluto y lo imprimimos por pantalla
		valorAbsoluto = (num>0) ? num : -num;
		System.out.println("El valor absoluto es: " + valorAbsoluto);
		
		//Cierra el scanner
		sc.close();			
		
	}

}
