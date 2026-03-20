import java.util.*;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Character> dq = new ArrayDeque<>();

        String input = sc.nextLine();

        for (char c : input.toCharArray()) {
            dq.addLast(c);
        }

        boolean isPalindrome = true;

        while (dq.size() > 1) {
            if (dq.removeFirst() != dq.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}