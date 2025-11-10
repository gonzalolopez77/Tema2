package for_;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
				
		//
		int num;
		double media = 0;
		
		// for: desde 1 hasta 10 de 1 en 1
		for(int cont = 1; cont<= 10; cont++) {
			System.out.println("Introduce un numero:");
			num = sc.nextInt();
			media += num;
		}
			
		//Calculamos la media
		media = media / 10;
		
		//Imprimimos la media
		System.out.println("La media es: " + media);
		
		//Cierra el scanner
		sc.close();			
		
	}

}
