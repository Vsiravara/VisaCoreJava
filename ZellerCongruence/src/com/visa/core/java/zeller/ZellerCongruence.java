package com.visa.core.java.zeller;

import java.util.Scanner;

public class ZellerCongruence {

	private static Scanner sc;
	private static String convertDayToString( int dayOfWeek ){
		switch( dayOfWeek ){
		case 0: return "Saturday";
		case 1: return "Sunday";
		case 2: return "Monday";
		case 3: return "Tuesday";
		case 4: return "Wednesday";
		case 5: return "Thursday";
		case 6: return "Friday";
		default: return "Error";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		while( true ){
			sc = new Scanner( System.in );
			System.out.println("Enter the day of the month ");
			String userInput = sc.nextLine();
			boolean timeToQuit = "quit".equalsIgnoreCase( userInput );
			if( timeToQuit ){
				break;
			}
			
			try{
				int  day = Integer.parseInt(userInput);
				System.out.println("Enter year ");
				int year = sc.nextInt();
				System.out.println("Enter the month ");
				int month = sc.nextInt();
	//			a = integer part of (13 x (month + 1) / 5)
	//			b = integer part of (year / 4)
	//			c = 6 x integer part of (year / 100)
	//			d = integer part of (year / 400)
				if( month == 1 || month == 2){
					year -= 1;
					month += 12;
				}
				int a = ( int ) ( 13 * ( month + 1 ) / 5 ) ;
				int b = year / 4;
				int c = 6 *( int ) ( year / 100 );
				int d = year / 400;
				int dayOfWeek = ( a + b + c + d + year + day ) % 7;
				System.out.println( convertDayToString(dayOfWeek) );
			} catch( Exception ex ){
				ex.printStackTrace();
			}
		}

     }

}
