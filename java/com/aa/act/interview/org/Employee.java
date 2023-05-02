package com.aa.act.interview.org;

import java.util.concurrent.atomic.AtomicInteger;

public class Employee {


	private static AtomicInteger identifier = new AtomicInteger();
	private Name name;

	public Employee(int identifier, Name name) {
		if(name == null)
			throw new IllegalArgumentException("name cannot be null");
		this.identifier.set(identifier);
		this.name = name;
	}

	public Employee( Name name) {
		if(name == null)
			throw new IllegalArgumentException("name cannot be null");
		this.identifier.getAndIncrement();
		this.name = name;
	}

	public Employee(String name) {
	}

	public AtomicInteger getIdentifier() {
		return identifier;
	}

	public Name getName() {
		return name;
	}

	@Override
	public String toString() {
		return name.toString() + ": " + identifier;
	}
}
