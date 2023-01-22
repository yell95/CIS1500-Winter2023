import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter # of credits you have completed.");
        Scanner keyboard = new Scanner(System.in);
        int choice = Integer.parseInt(keyboard.nextLine());
        System.out.println("Completed credits " + choice);

        System.out.println("Please enter # of credits required for your degree");
        int creditsReq = (keyboard.nextInt());

        int remainingCredits = creditsReq - choice;

        System.out.println("How many credits do you take per semester on average?");
        int averageCredit = keyboard.nextInt();

        int remaining = remainingCredits / averageCredit;
        Math.ceil(remaining);


        System.out.println("Please enter cost per credit");
        int creditCost = keyboard.nextInt();

        System.out.println("Semesters remaining " + remaining);
        int estimatedCost = creditCost * remainingCredits;
        System.out.println("Estimated cost is " + estimatedCost);


    }
}