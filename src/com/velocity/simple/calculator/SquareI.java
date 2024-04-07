package com.velocity.simple.calculator;

public class SquareI implements Square {

	@Override
	public void getSquare(int num1) {
		int square = num1 * num1;
		System.out.println("Square : " + square);
	}
}
