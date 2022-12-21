package com.example.BackendTestApplication.Repositories;



import com.example.BackendTestApplication.Models.DiscountCard;

import java.util.List;

public interface CardRepo {
    List<DiscountCard> findAll();
}
