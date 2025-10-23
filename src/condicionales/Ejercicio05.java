package condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Entrada: 50 y 5 || Resultado esperado: 125 || Resultado obtenido: 125
		// Entrada: 801 y 8 || Resultado esperado: 600,75 || Resultado obtenido: 600,75

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos laa variables km,dias y la constante precio
		int km;
		int dias;
		final double PRECIO = 2.5;
		double precioTotal;

		// La consola nos muestra por pantalla "¿Cuantos kilometros son?" y nos pide un
		// valor que se almacenara en km
		// La consola nos muestra por pantalla "¿Y cuantos dias?" y nos pide un
		// valor que se almacenara en dias
		System.out.println("¿Cuantos kilometros son?");
		km = sc.nextInt();
		System.out.println("¿Y cuantos dias?");
		dias = sc.nextInt();

		// Almacenamos en precioTotal PRECIO * km
		precioTotal = PRECIO * km;

		// Utilizamos if para que cuando os dias sean mayor que 7 y los kilometros mayor
		// que 800 te haga un 30% de descuento y cuando no solo te diga el precio total
		if (dias > 7 && km > 800) {
			precioTotal = precioTotal * 0.30;
			System.out.println("Tu precio con descuento seria: " + precioTotal);
		} else {
			System.out.println("Tu precio sin descuento seria: " + precioTotal);
		}

		// Cierra el scanner
		sc.close();

	}

}
