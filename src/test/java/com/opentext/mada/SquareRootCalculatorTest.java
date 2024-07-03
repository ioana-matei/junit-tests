package com.opentext.mada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareRootCalculatorTest {

    @Test
    void SixteenSqrtShouldBeFour() {
        SquareRootCalculator sqrtcalculator = new SquareRootCalculator();
        assertEquals(4,sqrtcalculator.squareRoot(16));
    }
}