import java.util.Scanner;

class Practical3
 {
    public static void main(String[] args) 
       {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter a single letter: ");
         char ch = sc.next().charAt(0);

         ch = Character.toLowerCase(ch);

         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
           {
             System.out.println("The entered character is a Vowel");
           }
        else if (ch >= 'a' && ch <= 'z')
           {
             System.out.println("The entered character is a Consonant");
           }
        else
           {
            System.out.println("Invalid input! Please enter an alphabet.");
           }
      }
}