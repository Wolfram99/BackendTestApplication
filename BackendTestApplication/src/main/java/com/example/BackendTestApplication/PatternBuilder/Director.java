package com.example.BackendTestApplication.PatternBuilder;


import java.util.Map;

import com.example.BackendTestApplication.Models.DiscountCard;
import com.example.BackendTestApplication.Models.Product;


public class Director {
	
	public void createCheck(Builder builder, Map<Product, Integer> p, DiscountCard card) {
		builder.setName("CASH RECEIPT");
		builder.setNumber(123465);
		builder.setDate();
		builder.setTime();
		builder.setPlace("Minsk, Krasnoarmeyskaya str., 4a");
		builder.setNameOrg("'Devoloper'");
		builder.setProduct(p);
		builder.setDiscount(card);
	}
}