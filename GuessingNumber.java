import java.util.*;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 100);

        int attempts = 0;
        while (true) {
            System.out.println("Enter the number 1 to 100");
            int userguess = sc.nextInt();
            attempts++;
            if (userguess == randomNum) {
                System.out.println("Your Guess is correct");
                break;
            } else if (userguess < randomNum)
                System.out.println("Your guess is less than random number");
            else
                System.out.println("your guess is greater than random number");

        }
        sc.close();
        System.out.println("Number of attempts : " + attempts);

    }
}