package if_else;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos la variable a, b, c y x
		int a;
		int b;
		int c;
		int x;

		// La consola muestra que indiquemos un numero y el valor que le demos se almacena en a, b, c y x
		System.out.println("Indica un numero para a:");
		a = sc.nextInt();
		System.out.println("Indica un numero para b:");
		b = sc.nextInt();
		System.out.println("Indica un numero para c:");
		c = sc.nextInt();
		
		// Usamos if para calcular la ecuacion 
		if (b * b - 4 * a * c < 0) {
			System.out.println("No se puede hacer la raiz de un numero negativo");
		} else if (a == 0){
			x = -c/b;
		} else {
			
			}
			}

		// Cierra el scanner
		sc.close();			
		
	}

}
