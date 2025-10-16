package diagramas;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos la variable nota
		String nombre;
		int horas;
		double tarifa;
		double salarioBruto;
		double salarioNeto;
		double tasas = 0;
		
		// La consola muestra que indiquemos la hora
		System.out.println("Indica tu nombre: ");
		nombre = sc.nextLine();
		System.out.println("Indica las horas: ");
		horas = sc.nextInt();
		System.out.println("Indica la tarifa: ");
		tarifa = sc.nextInt();

		// Usamos if para calcular el salario
		if (horas <= 35) {
			salarioBruto = horas * tarifa;
		} else {
			salarioBruto = 35 * tarifa + (horas - 35) * tarifa * 1.5;
		}
		
		//Usamos if para calcular el salario neto
		if (salarioBruto <= 500) {
			salarioNeto = salarioBruto;
		} else if (salarioBruto <= 900) {
			tasas = salarioBruto * 0.25; salarioNeto = salarioBruto - tasas;
		}else {
			tasas = salarioBruto * 0.45; salarioNeto = salarioBruto - tasas;
		}
		
		//Imprime por pantalla el nombre , salario bruto, tasas y salario neto
		System.out.println("Nombre: " + nombre + ". Salario neto: " + salarioNeto+ ". Tasas: " + tasas + ". Salario bruto: " + salarioBruto);
		
		//Cerramos el scanner
		sc.close();		
		
	}

}
