package com.createiq.string.methods;

public final class Person {

	private final int id;
	private final String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "[" + id + " " + name + "]";
	}

	public static void main(String[] args) {
		Person p1 = new Person(100, "anil");
		System.out.println(p1);
	}

}
