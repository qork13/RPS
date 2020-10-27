package dmacc.beans;

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
	
	

	private void setComputerPlayerToRandom() {
	    Random rand = new Random();
	    int random_try = rand.nextInt(5) + 1;
	    
	    

	    if(random_try == 1){
	         computerPlayer = "rock";
	    }
	    else if(random_try == 2){
	         computerPlayer = "paper";
	    }
	    else if(random_try == 3){
	         computerPlayer = "scissors";
	    }
	    else if(random_try == 4){
		     computerPlayer = "lizard";
		    }
	    else {
	    	 computerPlayer = "spock";
	    }
	    return;
	    
	}
	
	
	private void determineWinner() {
		if (player1.equalsIgnoreCase("Rock")) {
			switch (computerPlayer.toLowerCase()) {
			case "rock":
				winner = ("Tied!");
				break;
			case "paper":
				winner = ("Paper");
				break;
			case "scissors":
				winner = ("Rock");
				break;
			case "lizard":
				winner = ("Rock");
				break;
			case "spock":
				winner = ("Spock");
			}
		} else if (player1.equalsIgnoreCase("Paper")) {
			switch (computerPlayer.toLowerCase()) {
			case "rock":
				winner = ("Paper");
				break;
			case "paper":
				winner = ("Tied");
				break;
			case "scissors":
				winner = ("scissors");
				break;
			case "lizard":
				winner = ("lizard");
				break;
			case "spock":
				winner = ("Paper");
			}
		} else if (player1.equalsIgnoreCase("scissors")) {
			switch (computerPlayer.toLowerCase()) {
			case "rock":
				winner = ("Rock");
				break;
			case "paper":
				winner = ("Scissors");
				break;
			case "scissors":
				winner = ("Tied");
				break;
			case "lizard":
				winner = ("Scissors");
				break;
			case "spock":
				winner = ("Spock");
			}
		} else if (player1.equalsIgnoreCase("lizard")) {
				switch (computerPlayer.toLowerCase()) {
				case "rock":
					winner = ("Rock");
					break;
				case "paper":
					winner = ("Lizard");
					break;
				case "scissors":
					winner = ("Scissors");
					break;
				case "lizard":
					winner = ("Tied");
					break;
				case "spock":
					winner = ("Lizard");
				}
		} else if (player1.equalsIgnoreCase("spock")) {
		switch (computerPlayer.toLowerCase()) {
		case "rock":
			winner = ("Spock");
			break;
		case "paper":
			winner = ("Paper");
			break;
		case "scissors":
			winner = ("Spock");
			break;
		case "lizard":
			winner = ("Lizard");
			break;
		case "spock":
			winner = ("Tied");
		}
}
		this.setWinner(winner);

	return;			
	}

	
}

