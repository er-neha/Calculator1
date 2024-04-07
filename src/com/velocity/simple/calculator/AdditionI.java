package com.velocity.simple.calculator;

public class AdditionI implements Addition {

	@Override
	public void getAddition(int add1, int add2) {
		int a;
		a = add1 + add2;
		System.out.println("Addition : " + a);
	}
}
