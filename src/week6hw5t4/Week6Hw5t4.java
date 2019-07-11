package week6hw5t4;

import java.util.Random;
import java.util.Scanner;

public class Week6Hw5t4 {
    public static void main(String[] args) {
        Scanner keyIn = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(101);
        boolean userCorrect = false;
        
        while(!userCorrect){
            System.out.println("Guess a number: ");
            int guessedNum = keyIn.nextInt();
            if(guessedNum > randomNum){
                System.out.println("Too high, try again.");
            } else if(guessedNum < randomNum){
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Correct Number!");
                userCorrect = true;
            }
            
        }
    }
    
}
