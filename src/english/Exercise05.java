package english;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		Scanner sc = new Scanner(System.in);
		
		//
		String data1;
		double value1;
		String data2;
		double value2;
		double operation;
		
		//
		System.out.println("Insert the data 1(D,T or V): ");
		data1 = sc.next().toUpperCase();
		System.out.println("Insert the value 1: ");
		value1 = sc.nextInt();
		System.out.println("Insert the data 2(D,T or V): ");
		data2 = sc.next().toUpperCase();
		System.out.println("Insert the value 2: ");
		value2 = sc.nextInt();
		
		//
		if (value1 > 0 && value2 > 0) {
			if (data1 .equals("D") && data2 .equals("T")) {
				operation = value1 / value2;
				System.out.println("The valor of V is: " + operation);
			} else if (data1 .equals("T") && data2 .equals("D")) {
				operation = value2 / value1;
				System.out.println("The valor of V is: " + operation);
			} else if (data1 .equals("V") && data2 .equals("T")) {
				operation = value1 * value2;
				System.out.println("The valor of D is: " + operation);
			} else if (data1 .equals("T") && data2 .equals("V")) {
				operation = value1 * value2;
				System.out.println("The valor of D is: " + operation);
			} else if (data1 .equals("V") && data2 .equals("D")) {
				operation = value1 * value2;
				System.out.println("The valor of T is: " + operation);
			} else if (data1 .equals("D") && data2 .equals("V")) {
				operation = value1 * value2;
				System.out.println("The valor of T is: " + operation);
			} else {
				System.out.println("Insert another data");
			}
		}else {
			System.out.println("Insert another number");
		}
		
		//
		sc.close();
	}

}
