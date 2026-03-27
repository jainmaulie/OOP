import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(String AccNo, String AccHolderName, double bal) {
        accountNumber = AccNo;
        accountHolderName = AccHolderName;
        balance = bal;
    }

    void deposit(double amount) {
        System.out.println("Balance = " + balance);
        System.out.println("Amount to be deposit: " + amount);
        balance += amount;
        System.out.println("Balance after deposit: " + balance);
    }

    void checkBalance() {
        System.out.println("Balance in account is: " + balance);
    }

    void withdraw(double amount) {
        System.out.println("Amount to be withdraw: " + amount);
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Remaining balance is: " + balance);
        } else {
            System.out.println("Bank balance is insufficient");
        }
    }
}

class SavingAccount extends BankAccount {
    double interestRate = 5;

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest on saving account: " + interest);
    }
}

class FixedDepositAccount extends BankAccount {
    double interestRate = 7;

    void maturityAmount(int years) {
        double maturity = balance + (balance * interestRate * years) / 100;
        System.out.println("Maturity Amount after " + years + " years: " + maturity);
    }
}


class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingAccount sa = new SavingAccount();
        sa.openAccount("SA101", "Maulie", 100000);
        sa.deposit(10000);
        sa.withdraw(5000);
        sa.checkBalance();
        sa.calculateInterest();

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("FD201", "Maulie", 50000);
        fd.checkBalance();
        fd.maturityAmount(3);

        sc.close();
    }
}