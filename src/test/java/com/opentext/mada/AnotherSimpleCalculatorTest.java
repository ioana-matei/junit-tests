package com.opentext.mada;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnotherSimpleCalculatorTest {

    @Test
    public void TenTimeNineShouldBeNinety() {
        AnotherSimpleCalculator anotherSimpleCalculator = new AnotherSimpleCalculator();
        assertEquals(90, anotherSimpleCalculator.multiply(10,9));
    }
}