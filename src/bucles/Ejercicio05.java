package bucles;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos las variables
		int edad;
		int sumaEdades = 0;
		int numAlumnos = 0;
		int numMayoresDeEdad = 0;
		double media;
		
		//Imprime por pantalla que introduzcamos una edad y almacena el valor que introduzcamos a edad
		System.out.println("Introduce una edad: ");
		edad = sc.nextInt();
		
		//Creamos un bucle que suma las edades introducidas, el numero de alumnos y del que se sale al introducir un valor negativo
		while (edad >= 0) {
			sumaEdades += edad;
			numAlumnos++;
			//Usamos un if para que cuando la edad sea mayor o igual que 18 sume 1 a el numero de mayores de edad
			if (edad >= 18) {
				numMayoresDeEdad++;
			}
			System.out.println("Introduzca una edad: ");
			edad = sc.nextInt();
		}
		
		//Calculamos la media de edad
		media = (double) sumaEdades/numAlumnos;
		
		//Imprimimos por pantalla todos los valores calculados
		System.out.println("Suma edades: " + sumaEdades);
		System.out.println("Numero de alumnos: " + numAlumnos);
		System.out.println("Numero de mayores de edad: " + numMayoresDeEdad);
		System.out.println("Media: " + media);
		
		//Cierra el scanner
		sc.close();
		
	}

}
