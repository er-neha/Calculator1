package com.velocity.simple.calculator;

public class ModulusI implements Modulus{

	@Override
	public void getModulus(int num1, int num2) {
		int mod = num1 % num2;
		System.out.println("Modulus : " + mod);
	}

}
