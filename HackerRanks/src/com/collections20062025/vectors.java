package com.collections20062025;

import java.util.Enumeration;
import java.util.Vector;

public class vectors {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();
		v.add(101);
		v.add(102);
		v.add(103);
		v.add(104);
		v.add(105);

		Enumeration<Integer> elements = v.elements();
		while (elements.hasMoreElements()) {
			Integer nextElement = elements.nextElement();
			System.out.println(nextElement);
		}
	}

}
