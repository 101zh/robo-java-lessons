import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a magic number between 1-10");
        int magicNum = scanner.nextInt();

        System.out.println("Guess an integer between 1-10");
        int guessedNum = scanner.nextInt();

        if (magicNum == guessedNum) {
            System.out.println("you win the guessing game");
        } else {
            System.out.println("try again some other time");
        }

        scanner.close();

    }
}
