package com.bl.prime;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to PRIME NUMBER checker!!!");
		System.out.println();
		System.out.println("Enter the number to check for Prime number!!!");
		int number = sc.nextInt();
		if(number == 0 || number == 1) {		//checking for 0 and 1 numbers
			System.out.println("This is neither prime nor composite number!!Please try again!!");
		}else {
			for(int i = 1; i <= number; i++) {
				if(number%i == 0) {
				count = count+1;
				}
			}
			if(count == 2) {
				System.out.println("The number is Prime");
			}else {
				System.out.println("The number is not Prime");
			}
		}
		sc.close();
	}
}

