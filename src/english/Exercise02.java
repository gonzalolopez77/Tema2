package english;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		Scanner sc = new Scanner(System.in);
		
		//
		double a = 1.5;
		double b = 2;
		double c = 1.5;
		double x = 5;
		String account;
		double money;
		
		//
		System.out.println("Money: ");
		money = sc.nextDouble();
		System.out.println("Account");
		account = sc.next().toUpperCase();
		
		//
		if (money > 0) {
			switch (account) {
			case "A"  -> {
				money = money * a;
			}
			case "B"  -> {
				money = money * b;
			}
			case "C"  -> {
				money = money * c;
			}
			case "X"  -> {
				money = money * x;
			}
			}
		}else {
			System.out.println("Indicates an amount of money");
		}
		
		//
		System.out.println("Money: " + money);
		
		//
		sc.close();
		
	}

}
