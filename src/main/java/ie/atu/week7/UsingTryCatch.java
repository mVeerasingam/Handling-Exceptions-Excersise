package ie.atu.week7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {

        Scanner myscan = new Scanner(System.in);
        while(true) {
            System.out.println("Please enter a number between 0-9 : ");
            try {
                int myNum = myscan.nextInt();
                if (myNum <= 9 && myNum > 0) {
                    System.out.println("You Entered " + myNum);
                    break;
                } else {
                    System.out.println("Not a valid number");
                }
            } catch (InputMismatchException ime) {
                System.out.println("error please try again");
                myscan.next();
            }
        }
    }
}
