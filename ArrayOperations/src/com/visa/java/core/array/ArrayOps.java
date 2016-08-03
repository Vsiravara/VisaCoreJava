package com.visa.java.core.array;

import java.util.Scanner;

public class ArrayOps {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of data items \n " );
		sc = new Scanner( System.in );
		try{
			int numOfItems = sc.nextInt();
			int arr[] = new int[numOfItems];
			System.out.print("Enter the items of the array");
			for( int i = 0 ; i < numOfItems; i++ ){
				arr[i] = sc.nextInt();
			}
			int sum = 0;
			for( int i = 0 ; i < numOfItems; i++ ){
				sum += arr[i];
			}
			System.out.print("Mean is: " + sum / numOfItems + "\n" );
			int min = arr[0];
			for( int i = 1; i < numOfItems; i++ ){
				if( arr[i] < min ){
					min = arr[i];
				}
			}
			System.out.print("Minimum item is " + min + "\n" );
			int max = arr[0];
			for( int i = 1; i < numOfItems; i++ ){
				if( arr[i] > max ){
					max = arr[i];
				}
			}
			System.out.print("Maximum item is " + max + "\n" );
		} catch( Exception ex ){
			ex.printStackTrace();
		}

	}

}
