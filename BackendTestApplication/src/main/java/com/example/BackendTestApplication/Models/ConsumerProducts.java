package com.example.BackendTestApplication.Models;


public class ConsumerProducts implements Product {
	private int id;
	private String name;
	private double cost;

	
	public ConsumerProducts() {}
	
	public ConsumerProducts(int id, String name, double cost) {
		this.id = id;
		this.name = name;
		this.cost = cost;
	}



	@Override
	public int getId() {
		return id;
	}
	@Override
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public double getCost() {
		return cost;
	}
	@Override
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return name + " " + cost ;
	}



}
