package com.codingdojo.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.setOpOne(10.5);
		c.setOpTwo(5.2);
		c.setOperation("+");
		c.performOperation();
		c.getResults();

	}

}
