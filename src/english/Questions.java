package english;

import java.util.Scanner;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number: ");
		x = keyboard.nextInt();
		switch (x)
		{
		 case 1: case 2: System.out.println("Green"); break;
		case 3: case 4: case 5: System.out.println("Blue"); break;
		}
		System.out.println("Red");

	}	
	}
