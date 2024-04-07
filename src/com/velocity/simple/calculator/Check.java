package com.velocity.simple.calculator;

import java.util.Scanner;

public class Check {

	public boolean askCheck() {
		 Scanner scan1 = new Scanner(System.in);
		 System.out.println("\nDo you want to check other number? ");
		 System.out.print(" Yes / No ");
		 String ccc = scan1.nextLine();
		 if(ccc.equalsIgnoreCase("yes")) {
			 return true;
			 
		 } else if(ccc.equalsIgnoreCase("no")) {
			 System.out.println("\nThank you..!!!");
			 return false;
		 }else {
			 System.out.println("\nINVALID\n" );
			 if( askCheck()==true){
				 return true;
			 }else {
				// System.out.println("\n Thank you..!!!");
				 return false;
			 }
						
		 }
	 }
}
