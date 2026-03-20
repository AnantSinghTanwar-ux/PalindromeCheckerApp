import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int l = 0, r = input.length() - 1;
        boolean isPalindrome = true;

        while (l < r) {
            if (input.charAt(l) != input.charAt(r)) {
                isPalindrome = false;
                break;
            }
            l++;
            r--;
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}