package com.example.BackendTestApplication.Models;

import java.util.HashMap;
import java.util.Map;

public class Check {
	private String name;
	private int number;
	private String date;
	private String time;
	private String place;
	private String nameOrg;
	private Map<Product, Integer> product = new HashMap<Product, Integer>();
	private DiscountCard card;

	public Check(String name, int number, String date, String time, String place, String nameOrg,
			Map<Product, Integer> product, DiscountCard card) {
		this.name = name;
		this.number = number;
		this.date = date;
		this.time = time;
		this.place = place;
		this.nameOrg = nameOrg;
		this.product = product;
		this.card = card;
	}

	public DiscountCard getCard() {
		return card;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public String getPlace() {
		return place;
	}

	public String getNameOrg() {
		return nameOrg;
	}

	public Map<Product, Integer> getProduct() {
		return product;
	}
}

