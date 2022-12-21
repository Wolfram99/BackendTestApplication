package com.example.BackendTestApplication.Bicycle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.example.BackendTestApplication.Models.ConsumerProducts;
import com.example.BackendTestApplication.Models.DiscountCard;
import com.example.BackendTestApplication.Models.Product;

public abstract class ReaderFile {

	public static Map<Product, Integer> callProduct(List<String[]> argSplit) {
		Map<Product, Integer> product = new HashMap<Product, Integer>();

		String strTemp = "";
		for (String[] st : argSplit) {
			try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/static/Product.txt"))) {
				while ((strTemp = br.readLine()) != null) {
					String[] temp = strTemp.split(" ");
					if (st[0].indexOf((temp[0])) != -1) {
						Product pr = new ConsumerProducts(Integer.parseInt(temp[0]), temp[1], Double.parseDouble(temp[2]));
						product.put(pr, Integer.parseInt(st[1]));
						break;
					}
				}

			} catch (Exception e) {
				System.out.println("ERROR: " + e.getMessage());
			}
		}

		return product;
	}

	public static DiscountCard callCrad(String cardNumber) {
		DiscountCard card = new DiscountCard();
		try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/static/DiscountCard.txt"))) {
			while (br.ready()) {
				String[] temp = br.readLine().split(" ");
				if (temp[0].equals(cardNumber)) {
					card = new DiscountCard(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
				}

			}

		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}

		return card;
	}
}
