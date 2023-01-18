
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
    }
}