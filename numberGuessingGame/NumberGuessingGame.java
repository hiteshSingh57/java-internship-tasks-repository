import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rm = new Random();
        int a = rm.nextInt(100) +1;

        Scanner sc = new Scanner(System.in);

        int attempts = 7;
        int guess = 0;
        while ( a != guess) {
            System.out.println("Enter a number");
            guess = sc.nextInt();
            attempts--;
            if (guess>a) {
                System.out.println("Too High");
            } else if (guess<a) {
                System.out.println("Too Low");
            }else {
                System.out.println("Correct! You guessed it!");
            }
            if (attempts == 0 && guess != a) {
                System.out.println("Game Over! The number was: " + a);
                break;
            }
        }
    }
}
