package condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Entrada: 2 || Resultado esperado: Mal || Resultado obtenido: Mal
		// Entrada: 184 || Resultado esperado: Bien || Resultado obtenido: Bien

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos las variables num1 y num2, que se le asignaran valores random entre 0
		// y99 y la variable sumaUsuario
		Random aleatorio = new Random();
		int num1 = aleatorio.nextInt(1, 100);
		int num2 = aleatorio.nextInt(1, 100);
		int sumaUsuario;

		// Creamos la variable numSuma y le asignamos el valor de num1 + num2
		int numSuma = num1 + num2;

		// La consola nos muestra por pantalla los dos numeros y nos pide que indiquemos
		// la suma que se almacenara en sumaUsuario
		System.out.println("Numero 1: " + num1);
		System.out.println("Numero 2: " + num2);
		System.out.println("Suma: ");
		sumaUsuario = sc.nextInt();

		// Utilizamos if para que cuando la suma que introducimos y la suma sean iguales
		// nos muestre por pantalla que esta bien y cuando no sean iguales que muestre
		// mal
		if (numSuma == sumaUsuario) {
			System.out.println("Bien");
		} else {
			System.out.println("Mal");
		}

		// Cierra el scanner
		sc.close();

	}

}
