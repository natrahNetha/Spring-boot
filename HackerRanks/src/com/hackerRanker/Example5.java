package com.hackerRanker;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Read the number of test cases

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong(); // Try to read input as long

                System.out.println(x + " can be fitted in:");

                if (x >= -128 && x <= 127)
                    System.out.println("* byte");
                if (x >= -32768 && x <= 32767)
                    System.out.println("* short");
                if (x >= -2147483648L && x <= 2147483647L)
                    System.out.println("* int");
                System.out.println("* long"); // If it fits in long, print this
            } catch (Exception e) {
                // If the number is too big to fit in long
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }


}
