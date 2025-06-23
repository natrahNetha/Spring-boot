package com.hackerRanker;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

//		In each line of output there should be two columns:
//	    The first column contains the String and is left justified using exactly  characters.
//	    The second column contains the integer, expressed in exactly  digits; 
//		if the original input has less than three digits, you must pad your output's leading digits with zeroes.

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Word...and number!");
		for (int i = 0; i < 3; i++) {
			String w = s.next();
			int ix = s.nextInt();
			System.out.println();
			System.out.printf("%-15s%03d/n",w,ix);
		}

	}
}
