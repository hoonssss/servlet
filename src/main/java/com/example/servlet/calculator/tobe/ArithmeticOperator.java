package com.example.servlet.calculator.tobe;


import com.example.servlet.calculator.domain.PositiveNumber;

public interface ArithmeticOperator {
    boolean supports(String operator);

    int calculate(final PositiveNumber operand1, final PositiveNumber operand2);
}
