package condicionales;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Entrada: 2 y 2024 || Resultado esperado: "Es bisiesto" y "Ese mes tiene 29 dias" || Resultado obtenido: "Es bisiesto" y "Ese mes tiene 29 dias"
		// Entrada: 2 y 2021 || Resultado esperado: "No es bisiesto" y "Ese mes tien 28 dias" || Resultado obtenido: "No es bisiesto" y "Ese mes tiene 28 dias"
		

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos laa variables km,dias y la constante precio
		int mes;
		int año;

		// La consola nos muestra por pantalla que indiquemos el numero de un mes y lo almacena en mes
		// La consola nos muestra por pantalla que indiquemos un año y lo almacena en año
		System.out.println("Mes: ");
		mes = sc.nextInt();
		System.out.println("Año: ");
		año = sc.nextInt();
		boolean esBisiesto;

		// Usamos if para que cuando el resto de año y 4 sea 0 y el de año y 100 no sea
		// 0 sea bisiesto o que cuando el resto de año y 100 sea 0 y el de año y 400 no
		// lo sea sea bisiesto
		esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 100 == 0 && año % 400 != 0);
		if (esBisiesto) {
			System.out.println("Es bisiesto");
		} else {
			System.out.println("No es bisiesto");
		}

		//Usamos if para que nos diga el numero de dias segun el mes
		if (mes >= 1 && mes <= 12 ) {
			switch (mes) {
			case 1,3,5,7,8,10,12 -> {
				System.out.println("Ese mes tiene 31 dias");
			}
			case 4,6,9,11 -> {
				System.out.println("Ese mes tiene 30 dias");
			}
			case 2 -> {
				if (esBisiesto) {
				System.out.println("Ese mes tiene 29 dias");
			}else {
				System.out.println("Ese mes tiene 28 dias");
			}
			}
			}
		}else {
			System.out.println("Un año solo tiene 12 meses");
		}
		
		
		// Cierra el scanner
		sc.close();

	}

}
