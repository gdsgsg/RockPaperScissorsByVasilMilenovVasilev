import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chose [r]ock, [p]aper or [s]cissors: ");
        String input = scanner.nextLine();
        String playerMover = "";

        switch (input) {
            case "r":
            case "R":
            case "rock":
            case "Rock":
                playerMover = "Rock";
                break;
            case "p":
            case "P":
            case "paper":
            case "Paper":
                playerMover = "Paper";
                break;
            case "s":
            case "S":
            case "scissors":
            case "Scissors":
                playerMover = "Scissors";
                break;
            default:
                System.out.println("Invalid Input. Please Try Again...");
                return;
        }

        int computerRandomNumber = random.nextInt(3);
        String computerMove = "";

        switch (computerRandomNumber) {
            case 0:
                computerMove = "Rock";
                break;
            case 1:
                computerMove = "Paper";
                break;
            case 2:
                computerMove = "Scissors";
                break;
        }

        System.out.printf("The computer chose %s.%n", computerMove);

        if ((playerMover.equals("Rock") && computerMove.equals("Scissors")) ||
                (playerMover.equals("Paper") && computerMove.equals("Rock")) ||
                (playerMover.equals("Scissors") && computerMove.equals("Paper"))) {
            System.out.println("You win.");

        } else if ((computerMove.equals("Rock") && playerMover.equals("Scissors")) ||
                (computerMove.equals("Paper") && playerMover.equals("Rock")) ||
                (computerMove.equals("Scissors") && playerMover.equals("Paper"))) {
            System.out.println("You lose.");
        } else {
            System.out.println("This game was a draw.");
        }


    }
}