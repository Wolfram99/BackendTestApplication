package com.example.BackendTestApplication.Repositories;

import com.example.BackendTestApplication.Models.DiscountCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcCardRepo implements CardRepo{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<DiscountCard> findAll() {
        return jdbcTemplate.query("SELECT * FROM discountcard",new BeanPropertyRowMapper<>(DiscountCard.class));
    }
}
