package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber = getNumberSafe("Input first number:");
        int secondNumber = getNumberSafe("Input second number:");

        String action = getActionSafe();

        float result = 0;

        switch(action) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = (float) firstNumber / secondNumber;
                break;
            default:
                System.out.println("Something went wrong");
        }

        System.out.println(firstNumber + " " + action + " " + secondNumber + " = " + result);
    }

    static String getActionSafe() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input action (+, -, *, /):");

        String action = null;

        while(action == null) {
            action = scanner.nextLine();

            if(!action.equals("+") && !action.equals("-") && !action.equals("*") && !action.equals("/")) {
                action = null;

                System.out.println("Not a valid action, try again");
            }
        }

        return action;
    }

    static int getNumberSafe(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        Integer number = null;

        while(number == null) {
            try {
                String input = scanner.nextLine();

                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("NaN, try again");
            }
        }

        return number;
    }
}
