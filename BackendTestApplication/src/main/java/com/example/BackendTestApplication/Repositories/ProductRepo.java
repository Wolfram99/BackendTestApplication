package com.example.BackendTestApplication.Repositories;

import com.example.BackendTestApplication.Models.ConsumerProducts;

import java.util.List;

public interface ProductRepo {
    List<ConsumerProducts> findAll();
}
