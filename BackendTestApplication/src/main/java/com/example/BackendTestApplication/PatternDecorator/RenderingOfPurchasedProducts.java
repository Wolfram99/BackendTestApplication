package com.example.BackendTestApplication.PatternDecorator;


import java.util.Map;

import com.example.BackendTestApplication.Models.Check;
import com.example.BackendTestApplication.Models.Product;

public class RenderingOfPurchasedProducts implements CheckRender {

	@Override
	public String chekRenderMethod(Check check) {
		String str = String.format("%-8s\t%-15s\t%-15s\t%s\n","Quantity","Description","Price","Total" );
		double totalPosCost = 0;

		for (Map.Entry<Product, Integer> map : check.getProduct().entrySet()) {
			totalPosCost = map.getValue() * map.getKey().getCost();
			if (map.getValue() > 5) {
				totalPosCost -= totalPosCost * 0.1; // скидка 10%
			}
			str += String.format("%-12s\t%-15s\t%-15.2f\t%.2f\n", map.getValue(), map.getKey().getName(), map.getKey().getCost(),
					totalPosCost);
		}
		return str;
	}
}