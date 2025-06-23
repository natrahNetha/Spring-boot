package com.hackerRanker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tables {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the number Which tables u want");
//		int number = s.nextInt();
//		
//		for(int i=1;i<=10;i++) {
//			int result = number*i;
//			System.out.println(number+"*"+i+"="+result);
//		}

		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int N = Integer.parseInt(b.readLine().trim());
		b.close();

		for (int i = 1; i <= 10; i++) {
          
            System.out.println(N+"*"+i+"="+(N+i));
		}
	}
}
