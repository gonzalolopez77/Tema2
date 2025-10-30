package bucles;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos las variables num, suma, cantidadDeNumeros y media
		int num;
		int suma = 0;
		int sumaNegativa = 0;
		int cantidadDeNumerosNegativos = 0;
		int media = 0;
		int num0 = 0;
		int cantidadDeNumeros = 0;

		// Imprimimos por pantalla que introduzcamos un numero y lo almacena en num
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();

		// Usamos un bucle que suma los numeros introducidos y suma 1 a la cantidad de
		// numeros introducidos y cierra cuando introduzcamos un numero negativo
		while (cantidadDeNumeros < 10) {
			cantidadDeNumeros++;
			if (num > 0) {
				suma += num;
			} else if (num < 0) {
				sumaNegativa += num;
				cantidadDeNumerosNegativos++;
			} else {
				num0++;
			}

			System.out.println("Introduce un numero");
			num = sc.nextInt();
		}

		// Calculamos la media
		if (cantidadDeNumerosNegativos > 0) {
		media = sumaNegativa / cantidadDeNumerosNegativos;
		} else {
		}

		// Imprimimos por pantalla la media, la suma y el numero de 0
		System.out.println("La suma es: " + suma);
		System.out.println("La suma de negativos es: " + sumaNegativa);
		System.out.println("La media es: " + media);
		System.out.println("El numero de 0 es: " + num0);

		// Cierra el scanner
		sc.close();

	}

}
