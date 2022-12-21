package com.example.BackendTestApplication.PatternDecorator;

import com.example.BackendTestApplication.Models.Check;
import com.example.BackendTestApplication.Models.Product;

import java.util.Map;



public class CheckFooter extends DecoratorCheck {

	public CheckFooter(CheckRender checkRender) {
		super(checkRender);
	}

	public String createFooter(Check check) {
		double total = 0;
		String discount = "";
		for (Map.Entry<Product, Integer> map : check.getProduct().entrySet()) {
			double totalTemp = map.getKey().getCost() * map.getValue();
			if (map.getValue() > 5) {
				totalTemp -= totalTemp * 0.1;
			}
			total += totalTemp;
		}

		if (check.getCard().getDiscount() != 0) {
			total -= total * (check.getCard().getDiscount() * 0.01);
			discount = "The discount was: " + check.getCard().getDiscount() + "%" + "\n";

		}

		return String.format("%s\n%-10s%s%.2f\n%s\n", "-".repeat(55), discount, "Total: ", total, "-".repeat(55));

	}

	@Override
	public String chekRenderMethod(Check check) {
		return super.chekRenderMethod(check) + createFooter(check);
	}
}
