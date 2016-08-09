package com.visa.core.java.phtograph;

public class Phtograph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicCam wallStreetCam = new PublicCam();
		SecurityCam atmCam = new SecurityCam();
		UnderwaterCam pacificCam = new UnderwaterCam();
		Photographer[] photographers = { wallStreetCam, pacificCam, atmCam };
		for( Photographer photographer: photographers ){
			photographer.prepareScene();
			System.out.print(photographer.takePhotograph() + " \n");
		}
	}

}
