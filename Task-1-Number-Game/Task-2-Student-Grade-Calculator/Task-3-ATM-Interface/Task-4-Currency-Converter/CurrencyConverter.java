import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.println("3. INR to EUR");
        System.out.println("4. EUR to INR");
        System.out.print("Choose option: ");

        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        double result;

        switch (choice) {
            case 1:
                result = amount * 0.012;
                System.out.println("Converted Amount: $" + result);
                break;

            case 2:
                result = amount * 83.0;
                System.out.println("Converted Amount: ₹" + result);
                break;

            case 3:
                result = amount * 0.011;
                System.out.println("Converted Amount: €" + result);
                break;

            case 4:
                result = amount * 90.0;
                System.out.println("Converted Amount: ₹" + result);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
