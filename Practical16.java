class LoanCalculator {

    void calculateEMI(int principal, int time, float rate) {
        float monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Home Loan EMI: Rs. " + emi);
    }

    void calculateEMI(double principal, int time, double rate) {
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Vehicle Loan EMI: Rs. " + emi);
    }

    void calculateEMI(int principal, int time) {
        double rate = 10.0;  // fixed interest rate
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Personal Loan EMI (10% fixed): Rs. " + emi);
    }
}

public class Practical16 {

    public static void main(String[] args) {

        System.out.println("Maulie Jain 240390107024");

        LoanCalculator loan = new LoanCalculator();

        loan.calculateEMI(500000, 10, 7.5f);

        loan.calculateEMI(300000.0, 5, 9.0);

        loan.calculateEMI(200000, 3);
    }
}
