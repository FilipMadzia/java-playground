package rock_paper_scissors;

import java.util.Random;
import java.util.Scanner;

public final class Game {
    private Game() { }

    public static void startGame() {
        System.out.println("<===Rock x Paper x Scissors===>");

        RockPaperScissorsEnum playerHand = getPlayerHand();
        RockPaperScissorsEnum computerHand = getComputerHand();

        System.out.println("You chose: " + playerHand);
        System.out.println("Computer chose: " + computerHand);

        GameResultEnum gameResult = getGameResult(playerHand, computerHand);

        endGame(gameResult);
    }

    private static void endGame(GameResultEnum gameResult) {
        switch(gameResult) {
            case DRAW:
                System.out.println("It's a draw!");
                break;
            case PLAYER_WINS:
                System.out.println("Player wins!");
                break;
            case COMPUTER_WINS:
                System.out.println("Computer wins!");
                break;
            default:
                throw new RuntimeException("Game result isn't draw, player wins or computer wins");
        }
    }

    private static GameResultEnum getGameResult(RockPaperScissorsEnum playerHand, RockPaperScissorsEnum computerHand) {
        GameResultEnum winner = GameResultEnum.DRAW;

        if(playerHand == computerHand) {
            return winner;
        }

        switch(playerHand) {
            case ROCK:
                if(computerHand == RockPaperScissorsEnum.SCISSORS) {
                    winner = GameResultEnum.PLAYER_WINS;
                }
                else if(computerHand == RockPaperScissorsEnum.PAPER) {
                    winner = GameResultEnum.COMPUTER_WINS;
                }

                break;
            case PAPER:
                if(computerHand == RockPaperScissorsEnum.ROCK) {
                    winner = GameResultEnum.PLAYER_WINS;
                }
                else if(computerHand == RockPaperScissorsEnum.SCISSORS) {
                    winner = GameResultEnum.COMPUTER_WINS;
                }

                break;
            case SCISSORS:
                if(computerHand == RockPaperScissorsEnum.PAPER) {
                    winner = GameResultEnum.PLAYER_WINS;
                }
                else if(computerHand == RockPaperScissorsEnum.ROCK) {
                    winner = GameResultEnum.COMPUTER_WINS;
                }

                break;
            default:
                throw new RuntimeException("Player hand isn't rock, paper or scissors");
        }

        return winner;
    }

    private static RockPaperScissorsEnum getComputerHand() {
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        RockPaperScissorsEnum computerHand;

        switch(randomNumber) {
            case 0:
                computerHand = RockPaperScissorsEnum.ROCK;
                break;
            case 1:
                computerHand = RockPaperScissorsEnum.PAPER;
                break;
            case 2:
                computerHand = RockPaperScissorsEnum.SCISSORS;
                break;
            default:
                throw new RuntimeException("Random number was not 0, 1, 2");
        }

        return computerHand;
    }

    private static RockPaperScissorsEnum getPlayerHand() {
        System.out.println(
                "[1] Rock\n" +
                "[2] Paper\n" +
                "[3] Scissors\n" +
                "Choose your hand: ");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        RockPaperScissorsEnum playerHand;

        switch(input) {
            case "1":
                playerHand = RockPaperScissorsEnum.ROCK;
                break;
            case "2":
                playerHand = RockPaperScissorsEnum.PAPER;
                break;
            case "3":
                playerHand = RockPaperScissorsEnum.SCISSORS;
                break;
            default:
                playerHand = getPlayerHand();
                break;
        }

        return playerHand;
    }
}
