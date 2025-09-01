import java.util.*;
public class GuesstheNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    int numberToGuess = rand.nextInt(100) + 1; 
    int guess = 0;
    System.out.println("Guess a number between 1 and 100:");

    while (guess != numberToGuess) { 
        guess = sc.nextInt();
    if (guess > numberToGuess) {
        System.out.println("Too high, try again!"); 
    } else if (guess < numberToGuess) { 
        System.out.println("Too low, try again!"); 
    } else {
        System.out.println("Correct! You guessed it."); 
    }
}
    sc.close();
 }
}

