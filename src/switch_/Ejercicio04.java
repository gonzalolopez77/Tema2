package switch_;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos la variable dado1 y dado2
		String tirada1;
		String tirada2;
		int dado1;
		int dado2;
		int totalDados;
		
		//La consola nos pide el valor de los dados
		System.out.println("Indica el numero del primer dado: ");
		tirada1 = sc.next().toUpperCase();
		System.out.println("Indica el numero del segundo dado: ");
		tirada2 = sc.next().toUpperCase();
		
		//Utilizamos switch para que segun lo escrito en la consola se le asigne el valor numerico a dado1
		dado1 = switch (tirada1) {
		case "UNO" -> { 
			yield 1;
		}
		case "DOS" -> { 
			yield 2;
		}
		case "TRES" -> { 
			yield 3;
		}
		case "CUATRO" -> { 
			yield 4;
		}
		case "CINCO" -> { 
			yield 5;
		}
		case "SEIS" -> { 
			yield 6;
		}
		default -> {
			System.out.println("Fuera de rango");
			yield -1;
		}
		};
		
		//Utilizamos switch para que segun lo escrito en la consola se le asigne el valor numerico a dado2
		dado2 = switch (tirada2) {
		case "UNO" -> { 
			yield 1;
		}
		case "DOS" -> { 
			yield 2;
		}
		case "TRES" -> { 
			yield 3;
		}
		case "CUATRO" -> { 
			yield 4;
		}
		case "CINCO" -> { 
			yield 5;
		}
		case "SEIS" -> { 
			yield 6;
		}
		default -> {
			System.out.println("Fuera de rango");
			yield -1;
		}
		};		
		
		//Suma el valor de los dados y los imprime por pantalla
		totalDados= dado1 + dado2;
		System.out.println("La suma de los dados es: " + totalDados);
		
		//Cierra el scanner
		sc.close();
		
	}

}
