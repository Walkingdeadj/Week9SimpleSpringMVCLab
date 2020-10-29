package dmacc.model;

import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}

	private void determineWinner() {
		// TODO Auto-generated method stub
		//compare string to find winner
		if(player1.equals(computerPlayer)) {
			winner = "Tie";
		}else if(player1.equals("rock") && computerPlayer.equals("paper")) {
			winner = computerPlayer;
		}else if(player1.equals("rock") && computerPlayer.equals("spock")) {
			winner = computerPlayer;
		}else if(player1.equals("paper") && computerPlayer.equals("scissors")) {
			winner = computerPlayer;
		}else if(player1.equals("paper") && computerPlayer.equals("lizard")) {
			winner = computerPlayer;
		}else if(player1.equals("scissors") && computerPlayer.equals("rock")) {
			winner = computerPlayer;
		}else if(player1.equals("scissors") && computerPlayer.equals("spock")) {
			winner = computerPlayer;
		}else if(player1.equals("spock") && computerPlayer.equals("paper")) {
			winner = computerPlayer;
		}else if(player1.equals("spock") && computerPlayer.equals("lizard")) {
			winner = computerPlayer;
		}else if(player1.equals("lizard") && computerPlayer.equals("rock")) {
			winner = computerPlayer;
		}else if(player1.equals("lizard") && computerPlayer.equals("scissors")) {
			winner = computerPlayer;
		}
		else {
			winner = player1;
		}
	}

	private String setComputerPlayerToRandom() {
		// TODO Auto-generated method stub
		//random intput computer's choice
		Random rand = new Random();
		int pcInput = rand.nextInt(5);
		if(pcInput == 0) {
			computerPlayer = "rock";
		}else if(pcInput == 1) {
			computerPlayer = "paper";
		}else if(pcInput == 2){
			computerPlayer = "scissors";
		}else if(pcInput == 3) {
			computerPlayer = "spock";
		}else {
			computerPlayer = "lizard";
		}
		return computerPlayer;
	}
}
