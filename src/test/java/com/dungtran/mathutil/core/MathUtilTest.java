/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.dungtran.mathutil.core;

import static com.dungtran.mathutil.core.MathUtil.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author dungtr
 */
public class MathUtilTest {

    @Test
    public void testGetFactorialGivenRightArgumentReturnWell() {
        assertEquals(120, getFactorial(5));
    }

    @Test
    public void testGetFactorialGivenWrongArgumentThrowException() {

//        Executable exObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };
//        Executable exObject = () -> getFactorial(-5);
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
    }

    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {7, 720}
        };
    }

    @ParameterizedTest
    @MethodSource(value = "initData")
    public void testGetFactorialGivenRightArgumentReturnWell(int input, long expected) {
        assertEquals(expected, getFactorial(input));
    }

}
