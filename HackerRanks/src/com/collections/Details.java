package com.collections;

public class Details {

	int id;
	String name;
	String location;
	Details(int id, String name, String location) {
		
		this.id = id;
		this.name = name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Details [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	

}
