package com.hackerRanker;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
//		If  is odd, print Weird
//		If  is even and in the inclusive range of 2 to 5, print Not Weird
//		If  is even and in the inclusive range of 6 to 20, print Weird
//		If  is even and greater than 20 , print Not Weird
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println();
		if (n % 2 != 0) {
			System.out.println("Wired ");
		} else if (n >= 2 && n <= 5) {
			System.out.println("Not Wired ");
		} else if (n >= 6 && n <= 20) {
			System.out.println("weired");
		} else {
			System.out.println("Not Weird");
		}

	}

}
