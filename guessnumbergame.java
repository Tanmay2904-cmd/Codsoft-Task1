import  java.util.*;

public class guessnumbergame {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange =100;
        int maxAttempts = 10;
        int score = 0;

        boolean playAgain = true;
        while(playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("Welcome to the Number Guessing game");
            System.out.println("We selected a number between 1 and 100");
            
            int attempts = 0;
            while (attempts< maxAttempts) {
                System.out.println("Enter your guess number: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                }else if (userGuess >targetNumber){
                    System.out.println("Too high!try again.");
                }else if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number"+ targetNumber + " in "+ attempts + "attempts!");
                    score = score +1;
                    
                    break;
                
            
    
                }

                
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry you have max attempts.The correct answer was"+ targetNumber +".");
            }
            System.out.println("thanks for playing! Your total score is: " + score);
            System.out.println("Do you want to play another round? (yes/no):");
            String playagain = scanner.next();
            if (!playagain.equalsIgnoreCase("yes")){
               
                playAgain = false;
            }
        }
        scanner.close();
    }
}

        