package english;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create the scanner
		Scanner sc = new Scanner(System.in);
		
		//
		final double basic = 375.99;
		int option;
		double totalPrice = 0;
		int optionExtra;
		
		//
		System.out.println("Choose a screen");
		System.out.println("1: 38 cm (75,99)");
		System.out.println("2: 43 cm (99,99)");
		option = sc.nextInt();
		
		//
		if (option >= 1 && option <=2) {
		switch (option){
		case 1 -> {
			totalPrice = basic + 75.99;
		}
		case 2 -> {
			totalPrice = basic + 99.99;
		}
		}
		}else {
			System.out.println("Solo hay 2 opciones");
		}
		
		//
		System.out.println("Extras");
		System.out.println("0: Nada");
		System.out.println("1: Antivirus (65.99)");
		System.out.println("2: Printer (125)");
		optionExtra = sc.nextInt();
		
		//
		if (optionExtra >= 1 && optionExtra <=2) {
		switch (optionExtra){
		case 1 -> {
			totalPrice += 65.99;
		}
		case 2 -> {
			totalPrice += 125.00;
		}
		}
		}else if (optionExtra == 0) {
			
		}else {
			System.out.println("Solo hay 3 opciones");
		}		
		
		//
		System.out.println("El total seria: " + totalPrice);
		
		// Close the scanner
		sc.close();
		
		
	}

}
