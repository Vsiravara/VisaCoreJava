package com.visa.core.java.bandit;

import java.util.concurrent.ThreadLocalRandom;

public class Slots {
	private enum StateOfWheel{
		BAR,MEDAL,CHERRY,COIN;
	}
	public static void main(String[] args) {
		ThreadLocalRandom randomNumGenerator = ThreadLocalRandom.current() ;
		int [] game = new int[3];
		for( int i = 0 ; i < 3 ; i++ ){
			game[i] = randomNumGenerator.nextInt(4);
		}
		for( int element:game ){
			System.out.print(StateOfWheel.values()[element] + ":");
		}
		

	}

}
