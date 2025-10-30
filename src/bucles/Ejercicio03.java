package bucles;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos las variables num, suma, cantidadDeNumeros y media
		int num;
		int suma = 0;
		int cantidadDeNumeros = 0;
		int media;
		
		//Imprimimos por pantalla que introduzcamos un numero y lo almacena en num
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		//Usamos un bucle que suma los numeros introducidos y suma 1 a la cantidad de numeros introducidos y cierra cuando introduzcamos un numero negativo
		while (num >= 0) {
			suma += num;
			cantidadDeNumeros++;
			System.out.println("Introduce un numero");
			num = sc.nextInt();
		}
		
		//Calculamos la media
		media = suma / cantidadDeNumeros;
		
		//Imprimimos por pantalla la media y la suma
		System.out.println("La suma es: " + suma);
		System.out.println("La media es: " + media);
		
		//Cierra el scanner
		sc.close();				
		
	}

}
