import java.util.Scanner;

import java.util.Scanner;

class Atm {
    float Balance = 0.0f;  // Initializing the balance
    int Pin = 12345;

    public void checkpin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pin: ");
        int enterPin = sc.nextInt();
        if (enterPin == Pin) {
            System.out.println("PIN IS VALID");
            menu();
        } else {
            System.out.println("PIN IS INVALID");
        }
    }

    // Withdraw money
    private void withdrawMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to Withdraw: ");
        float enterAmount = sc.nextFloat();
        if (enterAmount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance -= enterAmount;
            System.out.println("Withdrawal Successful. Remaining Balance: " + Balance);
        }
    }

    // Check balance
    private void checkBalance() {
        System.out.println("Current Balance: " + Balance);
    }

    // Deposit money
    private void takeDeposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to Deposit: ");
        float amount = sc.nextFloat();
        Balance += amount;
        System.out.println("Successfully deposited. Current Balance: " + Balance);
    }

    // Menu for ATM options
    public void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    takeDeposit();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    return;  // Exit the loop and method
                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.checkpin();
    }
}

