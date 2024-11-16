package rock_paper_scissors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RockPaperScissorsEnum playerHand = getPlayerHand();

        System.out.println(playerHand);
    }

    static RockPaperScissorsEnum getPlayerHand() {
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
