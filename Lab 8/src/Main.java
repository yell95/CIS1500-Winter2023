import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to write new receipts? (y/n): ");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("y")) {
            PrintWriter writer = new PrintWriter(new FileWriter("receipts.txt"));
            double total = 0.0;
            int count = 0;

            while (true) {
                System.out.print("Enter a receipt total (or 'quit' to exit): ");
                String input = scanner.nextLine();
                if (input.equals("quit")) {
                    break;
                }
                double receiptTotal = Double.parseDouble(input);
                writer.println(receiptTotal);
                total += receiptTotal;
                count++;
            }
            writer.close();

            System.out.println("Receipts written to file.");
            System.out.println("Total price of receipts: " + total);
            System.out.println("Number of receipts: " + count);
            System.out.println("Average receipt value: " + (total / count));

        } else if (choice.equals("n")) {
            Scanner fileScanner = new Scanner(new File("receipts.txt"));
            double total = 0.0;
            int count = 0;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                double receiptTotal = Double.parseDouble(line);
                total += receiptTotal;
                count++;
            }
            fileScanner.close();

            System.out.println("Total price of receipts: " + total);
            System.out.println("Number of receipts: " + count);
            System.out.println("Average receipt value: " + (total / count));

        } else {
            System.out.println("Invalid choice");
        }
    }
}
