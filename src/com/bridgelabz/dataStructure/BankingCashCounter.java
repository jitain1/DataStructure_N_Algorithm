package com.bridgelabz.dataStructure;

import java.util.Scanner;

import com.bridgelabz.queue.Queue;

public class BankingCashCounter {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		Scanner counter = new Scanner(System.in);
		System.out.println("Enter the number of persons");
		int per = counter.nextInt();

		boolean result = checkNumber(per);
		if (result) {
			int cash = 99999999;
			// to put every person in a queue
			for (int i = 0; i < per; i++) {
				queue.enqueue(i);
			}
			while (per != 0) {
				System.out.println("amount available " + cash);
				int count = 0, option = 0;

				while (count == 0) {
					System.out.println("the person wants to \n1: Withdraw \n2: Deposit");
					option = counter.nextInt();

					switch (option) {
					case 1:
						System.out.println("Enter the required amount to withdraw");
						int amount = counter.nextInt();
						System.out.println("amount withdrawn successfully");
						queue.dequeue();
						cash = cash - amount;
						count += 1;
						System.out.println("Remaining cash " + cash);
						per--;
						System.out.println("--------THANKYOU VISIT AGAIN-------");
						break;

					case 2:
						System.out.println("Enter the required amount to deposit");
						int amount1 = counter.nextInt();
						System.out.println("amount deposited successfully");
						queue.dequeue();
						cash = cash + amount1;
						count += 1;
						System.out.println("Remaining cash " + cash);
						per--;
						System.out.println("--------THANKYOU VISIT AGAIN-------");
						break;

					default:
						System.out.println("Invalid input");
					}
				}
			}
		} else {
			System.out.println("Invalid input");
		}
	}

	public static boolean checkNumber(int person) {
		if (person >= 0 || person <= 9) {
			return true;
		} else
			return false;
	}

}