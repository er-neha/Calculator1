package com.velocity.simple.calculator;

public class SubtractionI implements Subtraction{

	@Override
	public void getSubtraction(int num1, int num2) {
		int sub = num1 - num2;
		System.out.println("Subtraction : " + sub);		
	}
}
