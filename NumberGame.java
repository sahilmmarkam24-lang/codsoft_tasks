public class numbergame {
    
}
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        int roundsWon = 0;
        String playAgain;

        System.out.println("=== NUMBER GUESSING GAME ===");

        do {
            int number = random.nextInt(100) + 1;
            int maxAttempts = 7;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nGuess a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");

                if (!sc.hasNextInt()) {
                    System.out.println("Please enter a valid integer.");
                    sc.next();
                    continue;
                }

                int guess = sc.nextInt();

                if (guess < 1 || guess > 100) {
                    System.out.println("Enter a number between 1 and 100.");
                    continue;
                }

                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You guessed the number.");
                    System.out.println("Attempts used: " + attempts);

                    int points = (maxAttempts - attempts + 1) * 10;
                    totalScore += points;
                    roundsWon++;

                    System.out.println("Points earned: " + points);
                    guessedCorrectly = true;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low! Try a higher number.");
                } else {
                    System.out.println("Too high! Try a lower number.");
                }

                System.out.println("Attempts remaining: "
                        + (maxAttempts - attempts));
            }

            if (!guessedCorrectly) {
                System.out.println("Game over! The number was " + number);
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("\n=== FINAL RESULTS ===");
        System.out.println("Rounds won: " + roundsWon);
        System.out.println("Total score: " + totalScore);
        System.out.println("Thanks for playing!");

        sc.close();
    }
