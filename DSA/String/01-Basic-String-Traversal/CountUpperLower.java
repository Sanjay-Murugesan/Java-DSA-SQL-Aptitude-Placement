import java.util.Scanner;

public class CountUpperLower {

    public static void main(String[] args) {

        // Creating Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Getting string input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Variables to store uppercase and lowercase count
        int upperCount = 0;
        int lowerCount = 0;

        // Traversing each character in the string
        for (int i = 0; i < str.length(); i++) {

            // Getting character one by one
            char ch = str.charAt(i);

            // Checking if character is uppercase
            if (Character.isUpperCase(ch)) {
                upperCount++;
            }

            // Checking if character is lowercase
            else if (Character.isLowerCase(ch)) {
                lowerCount++;
            }
        }

        // Printing the result
        System.out.println("Uppercase letters: " + upperCount);
        System.out.println("Lowercase letters: " + lowerCount);

        // Closing scanner
        sc.close();
    }
}
