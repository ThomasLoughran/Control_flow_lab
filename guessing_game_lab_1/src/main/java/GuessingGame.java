import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

//        declare correct number
        int ans = 32;
        System.out.println("Guessing game: \nGuess a number between 0 and 50 and you will be pointed in the right direction");

//        set while loop false until correct guess
        boolean correctGuess = false;
        int guess;
        
        while (correctGuess == false) {

//            prompt for user input
            Scanner reader = new Scanner(System.in);

//            store input as current guess
            guess = Integer.parseInt(reader.nextLine());

//                    return higher or lower response
            if (guess == ans) {
                System.out.println("Correct, the secret number is " + ans);
                correctGuess = true;
            }
            else if (guess <= ans) {
                System.out.println("Higher");
            }
            else {
                System.out.println("Lower");
            }


        }

    }
}
