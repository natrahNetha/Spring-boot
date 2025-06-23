package com.hackerRanker;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
//		int result = s.nextInt();
//		if(result%2!=0) {
//			System.out.println("it's a odd number");
//		}else {
//			System.out.println("its not a odd number");
//		}

		int result = s.nextInt();
		if(result%2==0) {
			System.out.println("its a even number ");
		}
		else {
			System.out.println("its not a even number");
		}
	}

}
