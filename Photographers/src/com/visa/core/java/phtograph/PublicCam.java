package com.visa.core.java.phtograph;

public class PublicCam implements Photographer{
	@Override
	public void prepareScene(){
		System.out.print("Taking photo of a group of tourists \n ");
	}
	
	@Override
	public String takePhotograph(){
		return " The tourists were eating pop corn \n " ;
	}

}
