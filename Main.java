package CODSOFT_JAVA_02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial balance of $1000
        ATM atm = new ATM(account);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            atm.displayMenu();
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            atm.processOption(option);
        }
    }
}
