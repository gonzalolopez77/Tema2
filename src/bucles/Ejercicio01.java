package bucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos las variables num y suma
		int num;
		int suma = 0;
		
		//Imprimimos por pantalla que introduzcamos un numero y lo almacena en num
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		//Usamos un bucle que suma los numeros introducidos y se cierra cuando introduzcamos un numero negativo
		while (num >= 0) {
			suma += num;
			System.out.println("Introduce un numero");
			num = sc.nextInt();
		}
		
		//Imprimimos por pantalla la suma
		System.out.println("La suma es: " + suma);
		
		//Cierra el scanner
		sc.close();			
		
	}

}
