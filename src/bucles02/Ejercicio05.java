package bucles02;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea la variable num
		int num;
		int contReps = 1;
		
		//Abrimos do
		do{
		
		//Pide que introduzcas un numero
		System.out.println("Introduce un numero entre el 0 y el 20:");
		num = sc.nextInt();
		
		//Utilizamos un bucle para cuando introduzca un valor no valido
		} while(num<0 || num>20);
		
		//Iniciamos cont en 1 y se incrementara cuando sea menor o igual que num de 1 en 1
		for(int cont = 1; cont <= num; cont++) {
			for(contReps = 1; contReps<= cont; contReps++) {
			System.out.print(cont);
			}
			//Imprimimos un espacio
			System.out.println();
		}
		
		//Cierra el scanner
		sc.close();
		
	}

}
