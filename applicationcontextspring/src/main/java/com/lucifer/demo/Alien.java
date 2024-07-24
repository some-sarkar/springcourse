package com.lucifer.demo;

public class Alien {
	
	private int age;
	private Laptop laptop;
	public Alien() {
		super();
	}

	
	public Alien(int age, Laptop laptop) {
		super();
		this.age = age;
		this.laptop = laptop;
	}



	public Laptop getLaptop() {
		return laptop;
	}

	

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void show() {
		System.out.println("in show");
	}


}
