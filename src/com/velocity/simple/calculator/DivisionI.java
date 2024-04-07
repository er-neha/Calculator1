package com.velocity.simple.calculator;

public class DivisionI implements Division {

	@Override
	public void getDivsion(int num1, int num2) {
		try {
			System.out.println("Division : " + num1 / num2);
		} catch (ArithmeticException e) {
			System.out.println("Divding by 0 results infinity");
		}
	}
}
