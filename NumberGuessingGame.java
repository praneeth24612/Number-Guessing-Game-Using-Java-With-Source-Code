import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random r=new Random();
        int randumNum=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        int guess;
        System.out.println("Welcom to the number game!");
        System.out.println("guess a number between 1 and 100:");
        
        while (true) {
			guess=sc.nextInt();
			if(guess==randumNum) {
				System.out.print("Congratulations, you guessed the number!");
				break;
			}
			else if(guess>=randumNum) {
				System.out.println("Your guess is too high. Try again :)");
			}
			else {
				System.out.println("Your guess is too low. Try again:)");
			}
			
		}
        sc.close();
    }
}
