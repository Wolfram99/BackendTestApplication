package com.example.BackendTestApplication.PatternBuilder;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.HashMap;

import java.util.Map;


import com.example.BackendTestApplication.Models.Check;
import com.example.BackendTestApplication.Models.DiscountCard;
import com.example.BackendTestApplication.Models.Product;

public class CheckBuilder implements Builder {
	private String name;
	private int number;
	private String date;
	private String time;
	private String place;
	private String nameOrg;
	private Map<Product, Integer> product = new HashMap<Product, Integer>();
	private DiscountCard card;

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setProduct(Map<Product, Integer> product) {
		this.product.putAll(product);
	}

	@Override
	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public void setDate() {
		SimpleDateFormat formDate = new SimpleDateFormat("dd/MM/yyyy");
		date = formDate.format(new Date());
	}

	@Override
	public void setTime() {
		SimpleDateFormat formTime = new SimpleDateFormat("HH:mm:ss");
		time = formTime.format(new Date());

	}

	@Override
	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public void setNameOrg(String nameOrg) {
		this.nameOrg = nameOrg;
	}

	@Override
	public void setDiscount(DiscountCard card) {
		this.card = card;

	}

	public Check build() {
		return new Check(name, number, date, time, place, nameOrg, product, card);
	}

}