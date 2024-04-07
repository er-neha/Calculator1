package com.velocity.simple.calculator;

import java.util.Scanner;

public class AverageI implements Average {

	@Override
	public void getAverage(int total) {
		Scanner scc = new Scanner(System.in);
		int i, n = 0, sum = 0;
		float avg=0;
		for (i = 1; i <= total; i++) {
			try {
				System.out.println("Enter number : ");
				n = scc.nextInt();
			} catch (RuntimeException e) {
				System.out.println("Interger input expected");
			}
			sum = n + sum;
			avg = sum / total;
		}
		System.out.println("Sum of numbers : " + sum);
		System.out.println("Average : " + avg);
	}
}
