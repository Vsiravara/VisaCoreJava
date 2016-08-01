package com.visa.core.java.converter;

import java.util.Scanner;

public class FarenheitToCelsiusConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );
		System.out.println("Enter the temperature in Farenheit ");
		String faren = sc.nextLine();
		try{
			double farenheitTemp = Double.parseDouble(faren);
			System.out.println( "Temperatur in Celsius is : " + 5 *( farenheitTemp - 32) / 9 );
		}catch( Exception ex ){
			System.out.println("Not a valid number ");
			ex.printStackTrace();
		}
	}
}
