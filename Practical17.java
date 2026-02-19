class Practical17 {

    static int totalStudents;
    static String universityName;

    static {
        universityName = "Saffrony Institute of Technology";
        totalStudents = 0;
        System.out.println("Static block executed");
    }

    {
        System.out.println("Instance Block Executed - Student Object Created");
    }

    University() {
        totalStudents++;
        System.out.println("Constructor block executed");
    }

    static int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String args[]) {

        System.out.println("Main Method Started");
        System.out.println("University Name: " + universityName);

        University s1 = new University();
        University s2 = new University();
        University s3 = new University();

        System.out.println("Total Students: " + University.getTotalStudents());
    }
}
