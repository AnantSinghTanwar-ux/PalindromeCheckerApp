import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    static boolean check(String s, int l, int r) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r)) return false;
        return check(s, l + 1, r - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(check(input, 0, input.length() - 1) ? "Palindrome" : "Not Palindrome");
    }
}