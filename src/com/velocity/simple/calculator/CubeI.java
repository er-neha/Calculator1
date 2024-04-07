package com.velocity.simple.calculator;

public class CubeI implements Cube{

	@Override
	public void getCube(int num1) {
		int cube = num1 * num1 * num1;
		System.out.println("Cube : " + cube);
	}
}
