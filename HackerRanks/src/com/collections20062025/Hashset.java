package com.collections20062025;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	public static void main(String[] args) {
//		HashSet<String> hs = new HashSet<>();
//		hs.add("one");
//		hs.add("two");
//		hs.add("three");
//		hs.add("four");
//		hs.add("five");
//		System.out.println(hs);
//		
//		hs.remove("two");
//		System.out.println(hs);

//		Iterator<String> iterator = hs.iterator();
//		while(iterator.hasNext()) {
//			String next = iterator.next();
//			System.out.println(next);
//		}

//	ArrayList<String> s = new ArrayList<String>(Arrays.asList("hello","Natraj"));
//	System.out.println(s);

		ArrayList<Integer> s = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		//s.removeIf(num->num%2==0);
		s.removeIf(num->num%2 !=0);
	 System.out.println("even numbers"+s);
		//System.out.println("odd Numbers:-"+s);
			


	}
}
