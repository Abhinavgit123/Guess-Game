import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand=new Random();
        int guessNo=rand.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        int guess;
        do{
            System.out.print("Enter your guess between (1-100): ");
            guess=sc.nextInt();
            if(guess<guessNo){
                System.out.println("Your guess is low.Try again");
            }
            else if (guess>guessNo){
                System.out.println("Your guess is high.Try again");
            }
        }while(guess!=guessNo);
        System.out.println("You guessed the number correctly");
    }
}