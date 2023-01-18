import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length;
        int width;
        int height;


        System.out.println("Hello world!");
        System.out.println("Hi there computer!");
        System.out.println("I could write a novel");
        System.out.println("Java cares about order of operations! YAY");
        System.out.println((2+2)*3);
        // the default length is 20
        int defaultLengthOfMyCarpet = 20;
        int defaultWidthOfMyCarpet = 10;
        System.out.println("The area of your carpet is "
                + defaultLengthOfMyCarpet * defaultWidthOfMyCarpet
                + " square ft");

        defaultLengthOfMyCarpet = 30;

        System.out.println("The area of your carpet is "
                + defaultLengthOfMyCarpet * defaultWidthOfMyCarpet
                + " square ft");

        // floats are annoying!
        float someFloatNumber = 1.7f;

        double numbersWithDecimalPlaces = 1.7;

        // integer division gives integers
        System.out.println("5 / 2 == " + 5 / 2);

        /* multi line comment
        asdfdsaf
        asdfdsafa
        asdfdsaf
        asdfdsa
        asdfdsaf
        */

        // double division gives doubles
        System.out.println("5.0 / 2 == " + 5.0 / 2);

        char singleCharacter = 'E';
        String myFirstName = "Eric";

        System.out.println("\"Hi\" there\n " + myFirstName);


        System.out.println("The number letters in my name is " + myFirstName.length());

        System.out.println(Math.PI);


        System.out.println(" 5 / 2 == " + 5 / 2 + " remainder " + 5 % 2);

        System.out.println(
    """
    Enter the number for what you want to buy
    1 - Pepsi
    2 - Coke
    3 - Sprite
    4 - Mountain Dew""");

        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        int choiceNumber = Integer.parseInt(choice);
        double choiceNumberWithDecimal = Double.parseDouble(choice);
        System.out.println("You picked option " + choice);
        System.out.println("That costs $" + choice);
        System.out.println("With tax, it actually costs " + choiceNumber * 1.06);

        System.out.println("Enter another choice");
        int anotherChoice = Integer.parseInt( keyboard.nextLine() );

        System.out.println("Please enter the length of your carpet");
        defaultLengthOfMyCarpet = Integer.parseInt( keyboard.nextLine() );

        System.out.println("Please enter the width of your carpet");
        defaultWidthOfMyCarpet = Integer.parseInt( keyboard.nextLine() );


        System.out.println("The area of your carpet is "
                + defaultLengthOfMyCarpet * defaultWidthOfMyCarpet
                + " square ft");


    }
}