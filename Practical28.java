import java.util.Scanner;

interface Classify {
    String getDivision(double average);
}

interface Exam {
    boolean isPassed(int mark);
}
class Result implements Classify, Exam {

    public boolean isPassed(int mark) {
        if (mark >= 40) {
            return true;
        } else {
            return false;
        }
    }

    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Maulie Jain. 240390107024");

        Result r = new Result();
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter average: ");
        double avg = sc.nextDouble();

        System.out.println("Marks = " + marks);
        System.out.println("Average = " + avg);

        if (r.isPassed(marks)) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }

        System.out.println("Division: " + r.getDivision(avg));

        sc.close();
    }
}