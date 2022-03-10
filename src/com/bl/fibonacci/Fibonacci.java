package com.bl.fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci();
		int prev = 0;
		int current = 1;
		System.out.println("Welcome to FIBONACCI NUMBERS generator!!!");
		System.out.println();
		System.out.println("Please enter the number of elements you want to print!!");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		fb.printFibonacciNumbers(prev, current, count);
		sc.close();
	}
	private int printFibonacciNumbers(int prev, int current, int count) {
		if(count ==0) {
			return 0;
		} else {
			System.out.print(prev + "\t");
		}
		return printFibonacciNumbers(current, prev+current, --count);
	}
}