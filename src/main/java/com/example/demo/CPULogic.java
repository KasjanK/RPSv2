package com.example.demo;

import java.util.Random;

public class CPULogic {
	public static String CPURandomizer() {
		String CPUMoves = "";
		Random random = new Random();
		int randomNum = random.nextInt(3) + 1;
		
		switch (randomNum) {
		case 1:
			CPUMoves = "rock";
			break;
		case 2:
			CPUMoves = "paper";
			break;
		case 3: 
			CPUMoves = "scissors";
			break;
		}
		return CPUMoves;
	}
}
