package com.example.BackendTestApplication.Bicycle;

import com.example.BackendTestApplication.Models.ConsumerProducts;
import com.example.BackendTestApplication.Models.DiscountCard;
import com.example.BackendTestApplication.Models.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ConvertListToMap {
    public static Map<Product, Integer> dsProduct(List<String[]> argSplit, List<ConsumerProducts> list) {
        Map<Product, Integer> product = new HashMap<Product, Integer>();

        for(String[] st: argSplit) {
            for (Product p : list) {
                if (Integer.parseInt(st[0]) == p.getId()) {
                    product.put(p, Integer.parseInt(st[1]));
                    list.remove(p);
                    break;
                }
            }
        }

        return product;
    }

    public static DiscountCard dsCard(String cardNum, List<DiscountCard> discountCards) {
        DiscountCard dc = new DiscountCard();


            for (DiscountCard c: discountCards) {
                if (Integer.parseInt( cardNum) == c.getNumber()) {
                    dc = new DiscountCard(c.getNumber(), c.getDiscount());
                    break;
                }
            }


        return dc;
    }

}