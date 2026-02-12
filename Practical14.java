import java.util.Scanner;

class BankAccount {
    String accountId;
    String accountHolderName;
    double balance;

    
    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Practical14 {
    public static void main(String[] args) {

        
        System.out.println("Maulie Jain 240390107024");

        Scanner sc = new Scanner(System.in);

        // Creating array of BankAccount objects
        BankAccount[] accounts = new BankAccount[5];

        // Adding account details
        accounts[0] = new BankAccount();
        accounts[0].assignValues("101", "maulie", 50000);

        accounts[1] = new BankAccount();
        accounts[1].assignValues("102", "yachika", 8500);

        accounts[2] = new BankAccount();
        accounts[2].assignValues("103", "khushi", 12000);

        accounts[3] = new BankAccount();
        accounts[3].assignValues("104", "preya", 7600);

        accounts[4] = new BankAccount();
        accounts[4].assignValues("A105", "riya", 9400);

        // Displaying all accounts
        System.out.println("All Bank Accounts:");
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayValues();
        }

        // Searching for an account
        System.out.print("Enter Account ID to search: ");
        String searchId = sc.next();

        boolean found = false;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountId.equals(searchId)) {
                System.out.println("Account Found:");
                accounts[i].displayValues();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }

        sc.close();
    }
}