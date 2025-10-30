package bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos las variables num y numerosPositivos
		int num;
		int numerosPositivos = 0;
		
		//Imprimimos por pantalla que introduzcamos un numero y lo almacena en num
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		//Usamos un bucle que suma 1 al numero de numeros positivos y se cierra cuando introduzcas un numero negativo
		while (num >= 0) {
			numerosPositivos++;
			System.out.println("Introduce un numero");
			num = sc.nextInt();
		}
		
		//Imprimimos por pantalla el numero de numeros positivos
		System.out.println("Numeros positivos: " + numerosPositivos);
		
		//Cierra el scanner
		sc.close();			
		
	}

}
