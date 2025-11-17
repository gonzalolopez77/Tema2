package bucles02;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea la variable num
		int num;
		int contReps = 1;
		int contEspacios;
		
		//Abrimos do
		do{
		
		//Pide que introduzcas un numero
		System.out.println("Introduce un numero:");
		num = sc.nextInt();
		
		//Utilizamos un bucle para cuando introduzca un valor no valido
		} while(num<1);
		
		//Iniciamos cont en 1 y se incrementara cuando sea menor o igual que num de 1 en 1
		for(int cont = 1; cont <= num; cont++) {
			for(contEspacios = num -1; contEspacios >= 1; contEspacios--) {
				System.out.print(" ");
			}
			for(contReps = 1; contReps <= cont; contReps++) {
				System.out.print("*");
			}
				
			System.out.println();
		}
		
		
		//Cierra el scanner
		sc.close();		
		
	}

}
