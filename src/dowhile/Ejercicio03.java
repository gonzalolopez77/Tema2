package dowhile;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea la variable num
		int num = 1;
		int suma = 0;
		int numMax;
		
		//Imprime por pantalla "Introduce un numero" y lo almacena en numMax
		System.out.println("Introduce un numero");
		numMax = sc.nextInt();
		
		//Abrimos do
		do {
		
		//Sumamos el valor de num a suma
			suma += num;
			
		//Incrementamos en 1 el valor de num
			num++;
		
		//Si num es menor o igual que numMax seguira repitiendose el bucle
		} while (num<=numMax);
		
		//Imprime por pantalla el valor de la suma
		System.out.println("La suma es: " + suma);
		
		//Cierra el scanner
		sc.close();				
		
	}

}
