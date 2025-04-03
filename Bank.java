import java.util.Scanner;

public class Bank {
    static Scanner var = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        double balance = 0;
        boolean isRunning = true;

        System.out.println("1. Show Balance");
        System.out.println("2. Deposit Amount");
        System.out.println("3. Withdraw Amount");
        System.out.println("4. Exit (Type 'exit' to quit)");

        while (isRunning) {
            System.out.println("Enter your choice (1-4) or type 'exit' to quit:");
            String input = var.nextLine().trim();  // Using nextLine to allow for full line input (e.g., "exit")

            if (input.equalsIgnoreCase("exit")) {
                isRunning = false;  // Exit the loop if 'exit' is typed
                System.out.println("Exiting the program...");
                break;  // Break the loop
            }

            try {
                // Convert the input to an integer if it's a valid number (choice 1 to 4)
                choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        ShowBalance(balance);
                        break;
                    case 2:
                        balance += Deposit();
                        break;
                    case 3:
                        balance -= Withdraw(balance);
                        break;
                    case 4:
                        isRunning = false;
                        System.out.println("Exiting the program...");
                        break;
                    default:
                        System.out.println("Incorrect Choice, please enter a number between 1 and 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 4 or type 'exit' to quit.");
            }
        }

        var.close();
    }

    static void ShowBalance(double balance) {
        System.out.println("Your balance: " + balance);
    }

    static double Deposit() {
        double amount;
        System.out.println("Enter the amount to deposit:");
        amount = var.nextDouble();
        var.nextLine(); // consume the newline character left by nextDouble()
        if (amount < 0) {
            System.out.println("Please enter a positive amount.");
            return 0;
        } else {
            return amount;
        }
    }

    static double Withdraw(double balance) {
        double amount;
        System.out.println("Enter the amount to withdraw:");
        amount = var.nextDouble();
        var.nextLine(); // consume the newline character left by nextDouble()
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return 0;
        } else if (amount < 0) {
            System.out.println("Please enter a positive amount.");
            return 0;
        } else {
            return amount;
        }
    }
}
