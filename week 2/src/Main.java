import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter # of credits you have completed.");
        int creditsCompleted = Integer.parseInt(keyboard.nextLine());

        System.out.println("Please enter # of credits required for your degree");
        int creditsReq = Integer.parseInt(keyboard.nextLine());

        System.out.println("How many credits do you take per semester on average?");
        double averageCredit = Double.parseDouble(keyboard.nextLine());
                                                  
        System.out.println("please enter your cost per credit");
        double creditCost = Double.parseDouble(keyboard.nextLine());
        
        int remainingCredits = creditsReq - creditsCompleted);
        double sesmestersLeft = Math.ceil(remainingCredits / averageCredit);
        double remainingCost = remainingCredits * creditCost);
        

        System.out.println("Semesters  remaining " + sesmestersLeft);
        System.out.println("Estimated cost is " + remainingCost);


    }
}
