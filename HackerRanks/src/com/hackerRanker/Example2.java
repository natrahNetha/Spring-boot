package com.hackerRanker;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		On the first line, print String: followed by the unaltered String read from stdin.
//		On the second line, print Double: followed by the unaltered double read from stdin.
//		On the third line, print Int: followed by the unaltered integer read from stdin.

		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();
		System.out.println("Int: " + i);
		double d = scan.nextDouble();
		System.out.println("Double: " + d);
		String s = scan.nextLine();
		System.out.println("String: " + s);

	}

}
