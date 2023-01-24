import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of credits you have so far");
        int numberOfCreditsCompleted = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter the number of credits you need to graduate");
        int numberOfCreditsNeeded = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter the number of credits you take per semester");
        double creditsPerSemester = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter the cost per credit hour");
        double costPerCreditHour = Double.parseDouble(keyboard.nextLine());

        int creditsRemaining = numberOfCreditsNeeded - numberOfCreditsCompleted;

        double numberOfSemesterLeft = Math.ceil(creditsRemaining / creditsPerSemester);

        double remainingCost = creditsRemaining * costPerCreditHour;

        System.out.println("You have " + numberOfSemesterLeft + " semesters left!");
        System.out.println("Your estimated cost is: $" + remainingCost);
    }
}