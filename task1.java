
//Project-1-Make a number guessing game-
//Importing the required packages-
import java.util.Random;
import java.util.Scanner;
public class Number_game {
    public static void main(String[] args) {
        int count;
        int attempts = 1;
        String ans;
        boolean b = false;
        int value = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("*RULES OF THE GAME*");
        System.out.println("There are total 3 attempts.");
        System.out.println("You have 10 chances to guess the answer in a single attempt.");


        if (value < 3)
        {
            for (int j = 1; j <= 3; j++) {
                if (b == false) {
                    count = 1;
                    Random r = new Random();
                    int com_num = r.nextInt(100);
                    do {
                        for (int i = 1; i <= 10; i++) {
                            System.out.println("Enter your number: ");
                            int user_no = s.nextInt();
                            if (user_no == com_num) {
                                System.out.println("Yes you guessed it right!!!");
                                System.out.println("You guessed in " + count + " times in " + attempts + " attempt");
                                break;
                            } else if (user_no > com_num) {
                                System.out.println("The number is High!!");
                                count++;
                            } else if (user_no < com_num) {
                                System.out.println("The number is low!!");
                                count++;
                            } else
                                System.out.println("Can't Guess!!");
                        }
                        attempts++;
                        System.out.println("Do you want to play again??-yes or no");
                        ans = s.next().toLowerCase();
                    } while (ans == "yes");

                    if (!ans.equals("yes")) {
                        b = true;
                        System.out.println("Thank you!");
                    }
                }
                value++;
            }
            if(attempts>3)
               System.out.println("Sorry!!,Attempts over! \nThank you for playing the game!!");
        }
    }
}