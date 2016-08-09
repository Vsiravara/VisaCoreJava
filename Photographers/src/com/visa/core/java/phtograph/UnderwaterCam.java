package com.visa.core.java.phtograph;

public class UnderwaterCam implements Photographer {
	@Override
	public void prepareScene(){
		System.out.print("Taking photo of fish \n ");
	}
	
	@Override
	public String takePhotograph(){
		return " The whale was smiling \n " ;
	}

}
