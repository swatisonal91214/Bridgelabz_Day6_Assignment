package com.bl.perfect;

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to PERFECT NUMBER CHECKER!!!");
		System.out.println();
		System.out.println("Enter the number to check for perfect number!!!");
		int number = sc.nextInt();
		for(int i = 1; i < number; i++) {
			if(number%i == 0) {
				count = count+i;
			}
		}
		if(count == number) {
			System.out.println("The number is Perfect number!!!");
		}else {
			System.out.println("The number is not perfect number!!");
		}
		sc.close();
		
	}

}
