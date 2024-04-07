package com.velocity.simple.calculator;

public class EvenOddI implements EvenOdd {

	@Override
	public void getEvenOrOdd(int num1) {
		if(num1 % 2 ==0) {
			System.out.println("It's even number. ");
		}else {
			System.out.println("It's odd number.");
		}
	}
}
