package com.visa.core.java.overload;

import java.util.Arrays;

public class OverLoadEx {
	private static String[] stringArray = { "zero","one","two","three","four","five","six","seven","eight","nine","ten" };
//	private static int addUp( int num1 , int num2 ){
//		return num1 + num2;
//	}
//	private static double addUp( double num1 , double num2 ){
//		return num1 + num2;
//	}
//	
//	private static int addUp( String num1, String num2 ){
//		return toNumber(num1) + toNumber(num2);
//	}
	private static int toNumber( String num ){
		return Arrays.asList(stringArray).indexOf(num.toLowerCase());
	}
	private static int addUp( int...numbers ){
		int sum = 0;
		for( int num: numbers ){
			sum += num;
		}
		return sum;
	}
	private static double addUp( double...numbers ){
		double sum = 0;
		for( double num: numbers ){
			sum += num;
		}
		return sum;
	}
	
	private static int addUp( String...numbers ){
		int sum = 0;
		for(String str:numbers){
			sum += toNumber(str);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print( addUp("one", "two") + "\n");
		System.out.print( addUp(1,2) +"\n");
		System.out.println(addUp(1.1, 2.2));
	}

}
