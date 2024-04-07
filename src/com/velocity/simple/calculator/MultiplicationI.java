package com.velocity.simple.calculator;

public class MultiplicationI implements Multiplication{

	@Override
	public void getMultiplication(int num1, int num2) {
		int mul = num1 * num2;
		System.out.println("Multiplication : " + mul);		
	}
}
