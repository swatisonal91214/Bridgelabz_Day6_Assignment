package com.bl.classwork;

public class ArrayRandomMethodUse {
	public static void main(String[] args) {
		int[] number = new int[10];
		System.out.println("Random numbers generated are:");
		for(int i = 0; i < number.length; i++) {
			number[i] = (int)(Math.random()*900)+100;
			System.out.print(number[i] + "    ");
		}
		ArrayRandomMethodUse  arrobj = new ArrayRandomMethodUse();
		arrobj.find(number);
	}
	
	public void find(int[] number) {
		int max_number = number[0];
		for(int i = 1; i < number.length; i++) {
			if(max_number < number[i]) {
				max_number = number[i];
			}
		}
		int min_number = number[0];
		for(int i = 1; i > number.length; i++) {
			if(min_number > number[i]) {
			   min_number = number[i];
			}
		}
		
		System.out.println();
		System.out.println("Greatest number in the above array is  : " + max_number);
		System.out.println("Smallest number in the above array is  : " + min_number);
	}
}

