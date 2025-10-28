package english;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		Scanner sc = new Scanner(System.in);
		
		//
		int price;
		int moneyClient;
		int change;
		
		//
		System.out.println("Price: ");
		price = sc.nextInt();
		System.out.println("Clients money: ");
		moneyClient = sc.nextInt();
		
		//
		change = moneyClient - price;
		
		//
		if (price > moneyClient) {
			System.out.println("Lack money");
		} else {
			int count2Euro = change/200;
			if (count2Euro > 0) {
				System.out.println("2 euros: " + count2Euro);
				change = change % 200;
			} else {
				
			}
			int count1Euro = change/100;
			if (count1Euro > 0) {				
				System.out.println("1 euros: " + count1Euro);
				change = change % 100;
			} else {
				
			}
			int count50cts = change/50;
			if (count50cts > 0) {
				System.out.println("50  cts: " + count50cts);
				change = change % 50;
			} else {
				
			}
			int count20cts = change/20;
			if (count20cts > 0) {		
				System.out.println("20  cts: " + count20cts);
				change = change % 20;
			} else {
				
			}
			int count10cts = change/10;
			if (count10cts > 0) {
				System.out.println("10  cts: " + count10cts);
				change = change % 10;
			} else {
				
			}
			int count5cts = change/5;
			if (count5cts > 0) {
				System.out.println("5  cts: " + count5cts);
				change = change % 5;
			} else {
				
			}
			int count2cts = change/2;
			if (count2cts > 0) {	
				System.out.println("2  cts: " + count2cts);
				change = change % 2;
			} else {
				
			}
			int count1cts = change/1;
			if (count1cts > 0) {
				System.out.println("1  cts: " + count1cts);
				change = change % 1;
			} else {
				
			}
		}
		
		//
		sc.close();

		
	}

}
