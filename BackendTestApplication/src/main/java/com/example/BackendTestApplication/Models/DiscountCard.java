package com.example.BackendTestApplication.Models;

public class DiscountCard {
	int number;
	int discount;

	public int getNumber() {
		return number;
	}

	public int getDiscount() {
		return discount;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public DiscountCard(int number, int discount) {

		this.number = number;
		this.discount = discount;
	}
	
	public DiscountCard() {
	}
}