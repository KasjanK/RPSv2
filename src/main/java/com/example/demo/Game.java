package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Game {
	@RequestMapping(value = "/game", method = { RequestMethod.POST, RequestMethod.GET }, produces = MediaType.APPLICATION_JSON_VALUE)
	public String Logic(String playerInput) {
		String pattern = "{ \"Wins\":\"%s\", \"Losses\":\"%s\", \"Ties\": \"%s\"}";
		 String CPUMove = CPULogic.CPURandomizer();
		
		if (CPUMove.equals("rock")) {
			if (playerInput.equals("rock")) {
				ScoreBean.ties++;
				return "It's a tie!";
			} else if (playerInput.equals("paper")) {
				ScoreBean.wins++;
				return "Player wins!";
			} else if (playerInput.equals("scissors")){
				ScoreBean.losses++;
				return "Computer wins!";
			}
		}
		if (CPUMove.equals("paper")) {
			if (playerInput.equals("paper")) {
				ScoreBean.ties++;
				return "It's a tie!";
			} else if (playerInput.equals("scissors")) {
				ScoreBean.wins++;
				return "Player wins!";
			} else if (playerInput.equals("rock")){
				ScoreBean.losses++;
				return "Computer wins!";
			}
		}
		if (CPUMove.equals("scissors")) {
			if (playerInput.equals("scissors")) {
				ScoreBean.ties++;
				return "It's a tie!";
			} else if (playerInput.equals("rock")) {
				ScoreBean.wins++;
				return "Player wins!";
			} else if (playerInput.equals("paper")){
				ScoreBean.losses++;
				return "Computer wins!";
			}
		}
		return String.format(pattern, ScoreBean.wins, ScoreBean.losses, ScoreBean.ties);
	}
}
