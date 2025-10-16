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
		System.out.println("Indica la hora:");
		hora = sc.nextInt();
		System.out.println("Indica los minutos:");
		minutos = sc.nextInt();
		System.out.println("Indica los segundos:");
		segundos = sc.nextInt();

		// Usamos if para saber que hora seria un segundo despues
		if (segundos < 59) {
			++segundos;
		} else {
			segundos= 0;
			
			if (minutos < 59) {
				++minutos; 
			}else {
				minutos = 0;
				
				if (hora < 24) {
					++hora;
				} else {
					hora = 0;
				}
		} 
			
		}
		
		//Imprime por pantalla las horas, minutos y segundos que seran dentro de un segundo
		System.out.println("Dentro de un segundo seran las " + hora + ":" + minutos + ":" + segundos);
		
		//Cerramos el scanner
		sc.close();
	}

}
