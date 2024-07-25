package com.lucifer.javabasedconfig;



public class Laptop {
	
	private int model;
	private int price;
	
	
	
	public Laptop(int model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", price=" + price + "]";
	}
	
	
	
	
}
