package com.example.BackendTestApplication.Bicycle;


import java.util.List;


import com.example.BackendTestApplication.Models.ConsumerProducts;
import com.example.BackendTestApplication.Models.DiscountCard;

public abstract class BuildCheck {

	public abstract String buildCheckFile(String[] args);
	public abstract String buildCheckDS(String[] args, List<ConsumerProducts> lp, List<DiscountCard> lc);


}