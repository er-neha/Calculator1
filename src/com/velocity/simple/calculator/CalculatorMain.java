package com.velocity.simple.calculator;

import java.util.Scanner;

public class CalculatorMain {
	Scanner scan = new Scanner(System.in);
	Addition add = new AdditionI();
	Subtraction sub = new SubtractionI();
	Multiplication mul = new MultiplicationI();
	Division div = new DivisionI();
	Modulus mod = new ModulusI();
	Square sq = new SquareI();
	Cube cube = new CubeI();
	Average avgg = new AverageI();
	Factor fact = new FactorI();
	EvenOdd eo = new EvenOddI();

	public void getChoice(int choice) {

	
		switch (choice) {
		case 1:
			System.out.println("Enter the first number : ");
			int num1 = scan.nextInt();
			System.out.println("Enter the second number : ");
			int num2 = scan.nextInt();
			add.getAddition(num1, num2);
			break;
		case 2:
			System.out.println("Enter the first number : ");
			int n1 = scan.nextInt();
			System.out.println("Enter the second number : ");
			int n2 = scan.nextInt();
			sub.getSubtraction(n1, n2);
			break;
		case 3:
			System.out.println("Enter the first number : ");
			int m1 = scan.nextInt();
			System.out.println("Enter the second number : ");
			int m2 = scan.nextInt();
			mul.getMultiplication(m1, m2);
			break;
		case 4:
			System.out.println("Enter the first number : ");
			int d1 = scan.nextInt();
			System.out.println("Enter the second number : ");
			int d2 = scan.nextInt();
			div.getDivsion(d1, d2);
			break;
		case 5:
			System.out.println("Enter the first number : ");
			int mo1 = scan.nextInt();
			System.out.println("Enter the second number : ");
			int mo2 = scan.nextInt();
			mod.getModulus(mo1, mo2);
			break;
		case 6:
			System.out.println("Enter the number : ");
			int num = scan.nextInt();
			sq.getSquare(num);
			break;
		case 7:
			System.out.println("Enter the number : ");
			int numm = scan.nextInt();
			cube.getCube(numm);
			break;
		case 8:
			System.out.println("Enter number of inputs : ");
			int total = scan.nextInt();
			avgg.getAverage(total);
			break;
		case 9:
			System.out.println("Enter the number : ");
			int f = scan.nextInt();
			fact.getFactor(f);
			break;
		case 10:
			System.out.println("Enter the number : ");
			int nummm = scan.nextInt();
			eo.getEvenOrOdd(nummm);
			break;
		default:
			System.out.println("Invalid input. Operation not available.");
			break;
		}

	}

	public static void main(String[] args) {
		CalculatorMain ca = new CalculatorMain();
		Scanner sc = new Scanner(System.in);
		Check check = new Check();
		int choice = 0;

		System.out.println(" Welcome to console based applicaton :");

		System.out.println("1. Addition of two number\n" + "2. Subtraction of two number\r\n"
				+ "3. Multiplication of two number\r\n" + "4. Division of two number\r\n"
				+ "5. Modulus of two number\r\n" + "6. Square of number\r\n" + "7. Cube of number\n"
				+ "8. Average of numbers\r\n" + "9. Factors of numbers\r\n" + "10.Find out even or odd number\r\n");

		do {
			while(true) {
				try {
					System.out.println("Enter your choice : ");
					choice = sc.nextInt();
					break;
					}catch(RuntimeException e){
						System.out.println("Expecting int typedata from 1 to 10");
						sc.next();
					}
			}
			
			ca.getChoice(choice);

		} while (check.askCheck() == true);

	}

}
