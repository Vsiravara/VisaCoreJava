package com.visa.core.java.phtograph;

public class SecurityCam implements Photographer {
	@Override
	public void prepareScene(){
		System.out.print("Taking photo of thief \n ");
	}
	
	@Override
	public String takePhotograph(){
		return " The thief was wearing a mask  \n " ;
	}

}
