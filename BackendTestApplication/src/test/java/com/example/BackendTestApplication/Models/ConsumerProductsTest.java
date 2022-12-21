package com.example.BackendTestApplication.Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsumerProductsTest {

    @Test
    void getId() {
        ConsumerProducts cp = new ConsumerProducts(1, "Чай", 6.23);
        assertEquals(1, cp.getId());
    }

    @Test
    void getName() {
        ConsumerProducts cp = new ConsumerProducts(1, "Чай", 6.23);
        assertEquals("Чай", cp.getName());
    }



    @Test
    void getCost() {
        ConsumerProducts cp = new ConsumerProducts(1, "Чай", 6.23);
        assertEquals(6.23, cp.getCost());
    }

}