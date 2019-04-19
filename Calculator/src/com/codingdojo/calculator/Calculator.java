package com.codingdojo.calculator;

public class Calculator {
	private double opOne;
	private double opTwo;
	private String operation;
	private double result;
	
	public Calculator() {
		opOne = 0;
		opTwo = 0;
		operation = "";
		result = 0;
	}
	
	public double getOpOne() {
		return opOne;
	}

	public void setOpOne(double opOne) {
		this.opOne = opOne;
	}

	public double getOpTwo() {
		return opTwo;
	}

	public void setOpTwo(double opTwo) {
		this.opTwo = opTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	public double getResults() {
		return result;
	}
	
	public double performOperation() {
		if(operation == "+") {
			result = opOne + opTwo;
			System.out.println(result);
		}
		else if(operation == "-"){
			result = opOne - opTwo;
			System.out.println(result);
			
		}
		else {
			System.out.println("only valid operators are subtraction and addition");
		}
		
		return result;
	}

	
}
