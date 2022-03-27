package com.bl.tobinary;

import java.util.Scanner;

public class ToBinaryConvertor {
	   
		public static void toBinary(int decimal){    
		     int binary[] = new int[40];    
		     int index = 0;    
		     while(decimal > 0){    
		       binary[index++] = decimal%2;    
		       decimal = decimal/2;    
		     }    
		     for(int i = index-1;i >= 0;i--){    
		       System.out.print(binary[i]);    
		     }    
		System.out.println();//new line  
		}    
		public static void main(String args[]){      
		System.out.println("Enter the decimal number ");  
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();   
		System.out.print("Decimal of number " + number + " is  ");  
		toBinary(21); 
		sc.close();
		}}      