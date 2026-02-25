import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Correct! You guessed the number.");
                break;
            } else if (guess > number) {
                System.out.println("Too High");
            } else {
                System.out.println("Too Low");
            }
        }

        sc.close();
    }
}
