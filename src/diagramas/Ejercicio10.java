package diagramas;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos la variable nota
		int hora;
		int minutos;
		int segundos;

		// La consola muestra que indiquemos la hora
		System.out.println("Indica un numero:");
		hora = sc.nextInt();	
		minutos = sc.nextInt();
		segundos = sc.nextInt();

		// Usamos if para saber que hora seria un segundo despues
		if (segundos < 59) {
			++segundos;
		} else if (minutos < 59) {
			++minutos;
		} else if (hora < 59) {
			
		}else if ()
					
		
	}

}
