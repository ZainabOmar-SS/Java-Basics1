import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
     int guess, answer, maxAnswer, minAnswer, attempts=0;
        // maximum value is 100
        final int MAX = 100;
       // take input
        Scanner in = new Scanner(System.in);
        // Random number
        Random rand = new Random();
        // correct answers
        answer = rand.nextInt(MAX) + 1;
        maxAnswer = answer + 10;
        minAnswer = answer - 10;

        while (attempts <= 5) {
            attempts++;
            System.out.println("Guess a number between 1 and 100: ");
            guess = in.nextInt();
            if (guess >= minAnswer && guess <= maxAnswer ) {
                System.out.println("your guess within 10 of the correct answer");
                System.out.println("correct answer= " + answer);
                System.exit(0);
            } else if (guess < minAnswer) {// Check guess value less than the
                // random value
                System.out.println("Your guess, " + guess + ", is less than the correct number");
            } else {
                System.out.println("Your guess, " + guess + ", is greater than the correct number");
            }
            if (attempts == 5) {
                System.out.println("Sorry, You consume all the attempts.");
                System.exit(0);
            }
        }

    }
}
