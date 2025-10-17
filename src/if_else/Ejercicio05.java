package if_else;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos la variable jugador1 y jugador2, y las constantes piedra, papel y tijera
		String jugador1;
		String jugador2;
		final String PIEDRA = "piedra";
		final String TIJERAS = "tijeras";
		final String PAPEL = "papel";

		// La consola muestra que indiquemos piedra, papel o tijera
		System.out.println("Jugador1: elige piedra, papel o tijeras:");
		jugador1 = sc.nextLine();
		System.out.println("Jugador2: elige piedra, papel o tijeras:");
		jugador2 = sc.nextLine();
		
		// Usamos if para calcular qien gana 
		if (jugador1.equalsIgnoreCase(jugador2)) {
		System.out.println("Empate");
		} else if (jugador1.equalsIgnoreCase(TIJERAS) && jugador2.equalsIgnoreCase(PAPEL)){
			System.out.println("Gana el jugador 1");}
		else if (jugador1.equalsIgnoreCase(PAPEL) && jugador2.equalsIgnoreCase(PIEDRA)){
			System.out.println("Gana el jugador 1");}
		else if (jugador1.equalsIgnoreCase(PIEDRA) && jugador2.equalsIgnoreCase(TIJERAS)){
			System.out.println("Gana el jugador 1");}
		else {
			System.out.println("Gana el jugador 2");
		}

		
		// Cierra el scanner
		sc.close();			
		
	}

}
