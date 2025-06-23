package com.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Details d1 = new Details(101, "Natraj", "Hyd");
		Details d2 = new Details(102, "Jayamma", "Rpt");
		Details d3 = new Details(103, "Srinidhi", "Ctl");

		ArrayList<Details> d = new ArrayList<>();

		d.add(d1);
		d.add(d2);
		d.add(d3);

		Iterator<Details> iterator = d.iterator();
		while (iterator.hasNext()) {
			Details next = iterator.next();
			System.out.println(next);
		}
		System.out.println("------------------");

		/* add */

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Saikrishna");
		a1.add("praveen");
		a1.add("pradeep");

		ArrayList<String> a2 = new ArrayList<>();
		a2.add("prabhas");
		a2.add("vijay");
		a2.add("pradeep");

		a2.addAll(a1);
		for (int i = 0; i < a2.size(); i++) {
			System.out.println(a2.get(i));
		}
		System.out.println("-----------------");

		ArrayList<String> a3 = new ArrayList<>();
		a3.add("bike");
		a3.add("Car");
		a3.add("motor");

		ArrayList<String> a4 = new ArrayList<>();
		a4.add("bike");
		a4.add("Maruthi");
		a4.add("Suzuki");

		a3.retainAll(a4);
		
		for(int x=0;x<a3.size();x++) {
			System.out.println(a3.get(x));
		}
	}
}
