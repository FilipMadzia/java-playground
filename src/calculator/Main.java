package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int firstNumber = getNumberSafe("Input first number: ");
        int secondNumber = getNumberSafe("Input second number: ");

        System.out.println(firstNumber);
        System.out.println(secondNumber);
    }

    static int getNumberSafe(String message) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(message);

        Integer number = null;

        while(number == null) {
            try {
                String input = reader.readLine();

                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("NaN, try again");
            }
        }

        return number;
    }
}
