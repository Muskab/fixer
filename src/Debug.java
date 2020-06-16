import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input your name: ");

        String inputString = input.nextLine();
        System.out.println("Enter your age: ");
        String age = input.nextLine();
        System.out.print("Enter your dob year: ");
        int dob = input.nextInt();
        System.out.println("Summary: " + "Your name is: " + inputString + "\n" + "Your age is: " + age + "\n" + "Your birth year is: " + dob);
    }
}