package com.visa.core.java.weather;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reading {
	String dayOfWeek;
	int hourOfDay;
	float temperature;
	float windSpeed;
	
	public Reading( String fileLine ){
		String elements[] = fileLine.split(", ");
		dayOfWeek = elements[0];
		hourOfDay = Integer.valueOf(elements[1]);
		temperature = Float.valueOf(elements[2]);
		windSpeed = Float.valueOf(elements[3]);
		
	}
	
	private String rateTemperature(){
		if( this.temperature < 55 )
			return "cold";
		else if( this.temperature < 65)
			return "mild";
		else if( this.temperature < 80 )
			return "warm";
		else
			return "invalid";
	}
	
	private String getTime(){
		String day = null;
		if( this.dayOfWeek.equalsIgnoreCase("Monday") ){
			day = "Monday";
		}
		else if( this.dayOfWeek.equalsIgnoreCase("Tuesday") )
			day = "Tuesday";
		else if( this.dayOfWeek.equalsIgnoreCase("Wednesday") )
			day = "Wednesday";
		else if( this.dayOfWeek.equalsIgnoreCase("Thursday" ) )
			day = "Thursday";
		else if( this.dayOfWeek.equalsIgnoreCase("Friday") )
			day = "Friday";
		else if( this.dayOfWeek.equalsIgnoreCase("Saturday") )
			day = "Saturday";
		else if( this.dayOfWeek.equalsIgnoreCase("Sunday") )
			day = "Sunday";
		else
			return "invalid";
		return day + " " + this.getTimeOfDay(this.hourOfDay) + " was ";
		
	}
	
	private String getTimeOfDay(int hourOfDay){
		if( hourOfDay <= 9 )
			return "morning";
		else if( hourOfDay <= 15 )
			return "afternoon";
		else
			return "night";
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader br = Files.newBufferedReader(
		        Paths.get("weather.csvx"));
		    Reading[] readings = new Reading[12];
		    for (int i = 0; i < readings.length; i++) {
		        readings[i] = new Reading(br.readLine());
			    System.out.println(readings[i].getTime() + readings[i].rateTemperature() );
		    }

		} catch( Exception ex ){
			ex.printStackTrace();
		}
		

	}

}
