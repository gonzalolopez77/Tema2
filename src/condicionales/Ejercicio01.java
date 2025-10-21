package condicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Entrada: -1 || Resultado esperado: Tiene que estar comprendido entre 0 y 9999 || Resultado obtenido: Tiene que estar comprendido entre 0 y 9999
		//Entrada: 10000 || Resultado esperado: Tiene que estar comprendido entre 0 y 9999 || Resultado obtenido: Tiene que estar comprendido entre 0 y 9999
		//Entrada: 11 || Resultado esperado: Es capicua || Resultado obtenido: Es capicua
		//Entrada: 101 || Resultado esperado: Es capicua || Resultado obtenido: Es capicua
		//Entrada: 1221 || Resultado esperado: Es capicua || Resultado obtenido: Es capicua
		//Entrada: 10 || Resultado esperado: No es capicua || Resultado obtenido: No es capicua
		//Entrada: 100 || Resultado esperado: No es capicua || Resultado obtenido: No es capicua
		//Entrada: 1234 || Resultado esperado: No es capicua || Resultado obtenido: No es capicua
		
		// Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos la variable num
		int num;
		
		//La consola nos pide el valor de un numero que se almacena en num
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		//Usamos if para calcular si es capicua
		if (num <0 && num >9999){
			System.out.println("Tiene que estar comprendido entre 0 y 9999");
		}else if (num<10) {
			System.out.println("Es capicua");
		}else if (num/10 == num%10) {
			System.out.println("Es capicua");
		}else if (num/100 == num%10) {
			System.out.println("Es capicua");		
		}else if (num/1000 == num%10 && (num/100)%10 == (num/10)%10) {
			System.out.println("Es capicua");
		}else {
			System.out.println("No es capicua");
		}
			
		//Cierra el scanner
		sc.close();		
		
	}

}
