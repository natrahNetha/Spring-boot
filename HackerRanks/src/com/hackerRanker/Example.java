package com.hackerRanker;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int lineNumbers = 1;
		while (s.hasNext()) {
			String nextLine = s.nextLine();
			System.out.println(lineNumbers + " " + nextLine);
			lineNumbers++;

		}
	}

}
