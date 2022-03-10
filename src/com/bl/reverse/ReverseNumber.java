package com.bl.reverse;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Number Reversing Program!!!");
		System.out.println();
		System.out.println("Enter the number to reverse between the range -999999999 to 1000000000 !!!!!!");
		int number = sc.nextInt();
			while(number != 0)   
			{  
				int remainder = number % 10;  
				reverse = reverse * 10 + remainder;  
				number = number/10;  
			}  
			System.out.println("The reverse of the given number is: " + reverse);  
			sc.close();
		}
	
}



