package edu.citytech.cst.service;

import java.util.Scanner;

public class MarginalTaxRate {

//	public static void main(String[] args) {
//
//		Scanner input = new Scanner(System.in);
//
//		System.out.println("Enter the filling status:\n" + "(0-single filer, 1-married jointly,\n "
//				+ "2-married separately, 3-head of household)");
//
//		String code = input.next();
//
//		System.out.println("Enter the taxable income: ");
//		float yearly = input.nextFloat();
//
//		System.out.println("Tax is " + taxPaid(code, yearly) * 100 / 100);
//		System.out.println(percent);
//		System.out.println(description);
//
//	}

	public static float percent = 0;
	public static float tax = 0;
	public static String description= "";


	public static float taxPaid(String code, float yearly) {
//		float[] rates = {.10f, .15f, .25f, .28f, .33f, .35f, .369f};
//		float tax = 0;
		
		switch(code) {
		case "SI":
			description= "Single Taxable Income";
			if (yearly <= 9326) {
				percent = .10f;
				tax = yearly * percent;
				
			} else if (yearly <= 37950){
				percent = .15f;
				tax = yearly  * percent;
				
			} else if (yearly <= 91900) {
				percent = .25f;
				tax = yearly * percent; 
				
			} else if (yearly <= 191650) {
				percent = .28f;
				tax = yearly * percent;
				
			}else if (yearly <= 416700) {
				percent = .33f;
				tax = yearly * percent;
				
			}else if (yearly <= 418400) {
				percent = .35f;
				tax = yearly * percent;
				
			} else {
				percent = .396f;
				tax = yearly * percent;
			}
			
			break;
			
		case "MFJ" :
			description="Married Filing Jointly";
			if (yearly <= 18650) {
				percent = .10f;
				tax = yearly * percent;
			} else if (yearly <= 75900){
				percent = .15f;
				tax = yearly  * percent;
				
			} else if (yearly <= 153100) {
				percent = .25f;
				tax = yearly * percent;
				
			} else if (yearly <= 233350) {
				percent = .28f;
				tax = yearly * percent; 
				
			}else if (yearly <= 416700) {
				percent = .33f;
				tax = yearly * percent;
				
			}else if (yearly <= 470700) {
				percent = .35f;
				tax = yearly * percent;
				
				
			} else {
				percent = .396f;
				tax = yearly * percent;
			}
			break;
			
		case "QW" :
			description="Qualified Widower";
			if (yearly <= 18650) {
				percent = .10f;
				tax = yearly * percent;
			} else if (yearly <= 75900){
				percent = .15f;
				tax = yearly  * percent;
				
			} else if (yearly <= 153100) {
				percent = .25f;
				tax = yearly * percent;
				
			} else if (yearly <= 233350) {
				percent = .28f;
				tax = yearly * percent; 
				
			}else if (yearly <= 416700) {
				percent = .33f;
				tax = yearly * percent;
				
			}else if (yearly <= 470700) {
				percent = .35f;
				tax = yearly * percent;
				
			} else {
				percent = .396f;
				tax = yearly * percent;
			}
			break;
			
		case "MFS":
			description="Marrried Filing separately";
			if (yearly <= 9325) {
				percent = .10f;
				tax = yearly * percent;
			} else if (yearly <= 37950){
				percent = .15f;
				tax = yearly  * percent;
				
			} else if (yearly <= 76550) {
				percent = .25f;
				tax = yearly * percent; 
				
			} else if (yearly <= 116675) {
				percent = .28f;
				tax = yearly * percent; 
				
			}else if (yearly <= 208350) {
				percent = .33f;
				tax = yearly * percent;
				
			}else if (yearly <= 235350) {
				percent = .35f;
				tax = yearly * percent;
				
			} else {
				percent = .396f;
				tax = yearly * percent;
			}
			
			break;
			
		case "HH":
			description="Head of Household";
			if (yearly <= 13350) {
				percent = .10f;
				tax = yearly * percent;
			} else if (yearly <= 50800){
				percent = .15f;
				tax = yearly  * percent;;
				
			} else if (yearly <= 131200) {
				percent = .25f;
				tax = yearly * percent;  
				
			} else if (yearly <= 212500) {
				percent = .28f;
				tax = yearly * percent;
				
			}else if (yearly <= 416700) {
				percent = .33f;
				tax = yearly * percent;
				
			}else if (yearly <= 444550) {
				percent = .35f;
				tax = yearly * percent;
				
			} else {
				percent = .396f;
				tax = yearly * percent;
			}
			break;
			
		case "NA":
			description="Not Applicable";
			tax = yearly * .40f;
		} 
		
		
		return tax;

	}

}
