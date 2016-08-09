package com.visa.core.java.errorhandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter input and output file names");
		Scanner sc = new Scanner( System.in );
		String inputFileName = sc.nextLine();
		String outputFileName = sc.nextLine();
		System.out.println("The file names are " + inputFileName + "  " + outputFileName );
		BufferedReader reader = null;
		BufferedWriter writer = null;
		boolean fileNotFound = true;
		while( fileNotFound ){
			try{
				
				reader = new BufferedReader(new FileReader(inputFileName));
			    writer = new BufferedWriter ( new FileWriter(outputFileName));
				String line = null;
				while( (line = reader.readLine()) != null  ){
					writer.write(line);
				}
			} catch( FileNotFoundException ex ){
				ex.printStackTrace();
				System.out.println(ex.getMessage());
				if( reader == null ){
					System.out.print("File not found , reenter file name " );
					inputFileName = sc.nextLine();
					continue;
				}
				if( writer == null ){
					System.out.print("Reenter output file : \n");
					outputFileName = sc.nextLine();
					continue;
				}

			}catch( IOException ex ){
				ex.printStackTrace();
				System.out.print( ex.getMessage() );
				
				
			}catch( Exception ex ){
				ex.printStackTrace();
				System.out.println(ex.getMessage());
			} 
			try{
				sc.close();
				if(  reader != null )
					reader.close();
				if( writer != null )
					writer.close();
			}catch( Exception ex ){
				ex.printStackTrace();
			}
			
			
			fileNotFound = false;
		}
		
		
	}

}
