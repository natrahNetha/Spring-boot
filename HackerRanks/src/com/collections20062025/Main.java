package com.collections20062025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) {

		details d = new details(101, "Natraj", "hyd");

		ArrayList<details> e = new ArrayList<>();
		e.add(new details(101, "Natraj", "software Engineer"));
		e.add(new details(102, "praveen", "jr software Engineer"));
		e.add(new details(103, "sai charAn", "telcecom Engineer"));

//		ListIterator<details> listIterator = e.listIterator();
//
//		while (listIterator.hasNext()) {
//            details next = listIterator.next();
//            System.out.println(next);
//		}

//		Iterator<details> iterator = e.iterator();
//		while(iterator.hasNext()) {
//			details next = iterator.next();
//			System.out.println(next);
//		}

	//	System.out.println("----------------");
		
		
	}
}
