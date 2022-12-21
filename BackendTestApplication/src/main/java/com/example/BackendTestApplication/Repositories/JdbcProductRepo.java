package com.example.BackendTestApplication.Repositories;

import com.example.BackendTestApplication.Models.ConsumerProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcProductRepo implements ProductRepo{
    @Autowired
    private JdbcTemplate jdbcTemplate;

//    @Override
//    public int count() {
//        return jdbcTemplate.queryForObject("SELECT Count(*) FRom consumerproducts",Integer.class);
//    }

    @Override
    public List<ConsumerProducts> findAll(){
        return jdbcTemplate.query("SELECT * FROM consumerproducts", new BeanPropertyRowMapper<>(ConsumerProducts.class));
    }
}
