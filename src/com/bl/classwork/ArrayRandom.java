package com.bl.classwork;

public class ArrayRandom {
	public static void main(String[] args) {
		int[] number = new int[10];
		int max_number = number[0];
		System.out.println("Random numbers generated are:");
		for(int i = 0; i < number.length; i++) {
				number[i] = (int)(Math.random()*1000);
				System.out.print(number[i] + "    ");
		}
		for(int i = 1; i < number.length; i++) {
			if(max_number < number[i]) {
				max_number = number[i];
			}
		}
		System.out.println();
		System.out.println("Greatest number in the above array is  : " + max_number);
	}
	
}
