package com.collections20062025;

import java.util.LinkedList;

public class LinkedinList {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		l.add(101);
		l.add(102);
		l.add(103);
		l.add(104);
		System.out.println(l);
		l.add(105);
		l.remove(1);
		System.out.println(l);

	}
}
