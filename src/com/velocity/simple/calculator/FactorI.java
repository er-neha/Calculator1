package com.velocity.simple.calculator;

public class FactorI implements Factor{

	@Override
	public void getFactor(int num1) {
		int i=1;
		System.out.print("Factors : ");
		while( i<= num1) {
			if (num1 %i ==0) {
				System.out.print(i + " ");
			}
			i++;			
		}			
	}
}
