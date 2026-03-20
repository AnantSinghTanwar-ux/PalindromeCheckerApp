import java.util.Scanner;

public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Input received: " + input);

        sc.close();
    }
}