class Practical18 {

    String account_holder_name;
    double balance;

    static double interest_rate;

    static {
        interest_rate = 5.0;
        System.out.println("Static block executed - Interest rate initialized");
    }

    Practical18(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    void display() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println("---------------------------");
    }

    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("Interest rate updated to: " + interest_rate + "%");
    }

    public static void main(String args[]) {

        System.out.println("Maulie Jain. 240390107024");

        Practical18 acc1 = new Practical18("Maulie", 10000);
        Practical18 acc2 = new Practical18("Yachika", 20000);

        acc1.display();
        acc2.display();

        Practical18.updateInterestRate(7.0);

        acc1.display();
        acc2.display();
    }
}
