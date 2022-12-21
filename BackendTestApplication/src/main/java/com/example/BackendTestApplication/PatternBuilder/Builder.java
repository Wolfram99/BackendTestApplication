
package com.example.BackendTestApplication.PatternBuilder;


import java.util.Map;


import com.example.BackendTestApplication.Models.DiscountCard;
import com.example.BackendTestApplication.Models.Product;

public interface Builder {

	void setName(String name);
	void setProduct(Map<Product, Integer> product);
	void setNumber(int number);
	void setDate(); 
	void setTime(); 
	void setPlace(String place);
	void setNameOrg(String nameOrg); 
	void setDiscount(DiscountCard card);
}