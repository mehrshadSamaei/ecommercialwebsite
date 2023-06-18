package com.example.ecommercialwithservlet.test;

import com.example.ecommercialwithservlet.Calculate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {
    @Test
    public void testAdd() {
        Calculate calculate = new Calculate();

        int add = calculate.add(5, 7);

        assertEquals(12, add);
    }

}