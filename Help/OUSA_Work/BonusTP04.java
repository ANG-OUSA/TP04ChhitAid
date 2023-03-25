package OUSA_Work;
import java.util.Scanner;

public class BonusTP04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-------- Menu ---------");
            System.out.println("1. Prime number");
            System.out.println("2. Lucky number");
            System.out.println("3. Reversing number");
            System.out.println("4. Money exchange");
            System.out.println("5. Max among 8 numbers");
            System.out.println("6. Shipping");
            System.out.println("7. Leap year");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("-----------------------\nInput a number: ");
                    int number = scanner.nextInt();
                    boolean isPrime = TP04.primeNumber(number);
                    if (isPrime) {
                        System.out.println(number + " is a prime number.");
                    } else {
                        System.out.println(number + " is not a prime number.");
                    }
                    break;
                case 2:
                    TP004_2;
                    break;
                case 3:
                    // call the reversingNumber method from TP04 class
                    break;
                case 4:
                    // call the moneyExchange method from TP04 class
                    break;
                case 5:
                    // call the maxAmong8Numbers method from TP04 class
                    break;
                case 6:
                    // call the shipping method from TP04 class
                    break;
                case 7:
                    // call the leapYear method from TP04 class
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }
}
