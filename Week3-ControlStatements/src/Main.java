import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your total cost");
        double totalCost = Double.parseDouble(keyboard.nextLine());

        // if it's true, the code block runs
        if (totalCost >= 5_000) {
            totalCost *= .7;
            System.out.println("You get a scholarship!");
        } else { // if the above if is false, the else runs
            System.out.println("Sorry you don't get the scholarship");
        }

        System.out.println("Your total cost is: $" + totalCost);

        System.out.println("Enter the price of the house you want to buy");
        double housePrice = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter the down payment you have");
        double downPayment = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter your credit score");
        int creditScore = Integer.parseInt(keyboard.nextLine());

        // down payment of 20% or more == yes
        // credit score of more than 800 == yes
        // down payment of 10% or more AND credit score of 700 or more == yes
        if ( ( downPayment / housePrice >= .2
            || creditScore > 800 )
            || ( downPayment / housePrice >= .1 && creditScore >= 700 )
            || (downPayment / housePrice >= .5 ) ) {
            System.out.println("You can get a mortgage");
        } else {
            System.out.println("You don't qualify");
        }

        if ( downPayment / housePrice >= .2  ){
            System.out.println("You can get a mortgage");
        } else if( creditScore > 800 ) {
            System.out.println("You can get a mortgage");
        } else if ( downPayment / housePrice >= .1
                    && creditScore >= 700 ) {
            System.out.println("You can get a mortgage!");
        } else {
            System.out.println("You don't qualify");
        }

        System.out.println("Enter your score 1-100");
        int score = Integer.parseInt(keyboard.nextLine());

        if ( score >= 94 ){
            System.out.println("A");
        } else if ( score >= 90 ){
            System.out.println("A-");
        } else if ( score >= 86 ){
            System.out.println("B+");
        } else if ( score >= 83 ){
            System.out.println("B");
        } else if ( score >= 80 ){
            System.out.println("B-");
        } else if ( score >= 76 ){
            System.out.println("C+");
        } else if ( score >= 73 ){
            System.out.println("C");
        } else if ( score >= 70 ){
            System.out.println("C-");
        }else if ( score >= 66 ){
            System.out.println("D+");
        } else if ( score >= 63 ){
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if ( score >= 94 ){
            System.out.println("A");
        }
        if ( score < 94 && score >= 90 ){
            System.out.println("A-");
        }
        if ( score < 90 && score >= 86 ){
            System.out.println("B+");
        }
        if ( score < 86 && score >= 83 ){
            System.out.println("B");
        }
        if ( score < 83 && score >= 80 ){
            System.out.println("B-");
        } 
        if ( score < 80 && score >= 76 ){
            System.out.println("C+");
        }
        if ( score < 76 && score >= 73 ){
            System.out.println("C");
        }
        if ( score < 73 && score >= 70 ){
            System.out.println("C-");
        }
        if ( score < 70 && score >= 66 ){
            System.out.println("D+");
        }
        if ( score < 66 && score >= 63 ){
            System.out.println("D");
        }
        if (score < 63 ){
            System.out.println("F");
        }

    }
}

