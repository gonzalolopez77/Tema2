package dowhile;

import java.util.Scanner;

public class Ejercicio06 {

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
		boolean opcion; 
		String reinicio;
		
		//Abrimos do 1
		do {
	
		//Abrimos do 2
		do {
		// La consola muestra que indiquemos piedra, papel o tijera
		System.out.println("Jugador1: elige piedra, papel o tijeras:");
		jugador1 = sc.nextLine();
		
		//Si jugador1 pone piedra, papel o tijera almacena true en opcion, y si no almacena false
		opcion = jugador1.equalsIgnoreCase(PAPEL) || jugador1.equalsIgnoreCase(TIJERAS) || jugador1.equalsIgnoreCase(PIEDRA);
		if(!opcion) {
			System.out.println("Introduce una opcion correcta");
		}
		
		// Repetimos el bucle mientras opcion sea false. Cerramos do 2
		} while (!opcion);
			
		//Abrimos do 3
		do {
					
		// La consola muestra que indiquemos piedra, papel o tijera	
		System.out.println("Jugador2: elige piedra, papel o tijeras:");
		jugador2 = sc.nextLine();
		
		//Si jugador2 pone piedra, papel o tijera almacena true en opcion, y si no almacena false
		opcion = jugador2.equalsIgnoreCase(PAPEL) || jugador2.equalsIgnoreCase(TIJERAS) || jugador2.equalsIgnoreCase(PIEDRA);
		if(!opcion) {
			System.out.println("Introduce una opcion correcta");
		}
			
		// Repetimos el bucle mientras opcion sea false. Cerramos do 3
		} while (!opcion);
		
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

			// Imprimimos por pantalla si quiere jugar otr partida
			System.out.println("Quieres jugar otra partida(s)?");
			reinicio = sc.nextLine();
			
		//Mientras reinicio sea igaul a s va a empezar otra partida	
		} while (reinicio.equalsIgnoreCase("S"));
			
		// Cierra el scanner
		sc.close();				
		
	}

}
