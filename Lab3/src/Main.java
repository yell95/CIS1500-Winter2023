import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of test you would like to score:");
        int numTest = Integer.parseInt(keyboard.nextLine());

        int[] scores = new int[numTest];
        int sum = 0;

        System.out.println("Enter test score:");
        int i = 0;
        while ( i < numTest ) {
            scores[i] = Integer.parseInt(keyboard.nextLine());
            sum += scores[i];
            i++;
        }

        double averageScore = sum / numTest;
        System.out.println("Your average test score is:" + averageScore);




    }
}