package com.lucifer.demo;

public class Laptop {
	
	private int model;
	private int price;
	
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
