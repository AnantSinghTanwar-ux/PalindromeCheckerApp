import java.util.*;

public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Character> q = new LinkedList<>();
        Stack<Character> s = new Stack<>();

        String input = sc.nextLine();

        for (char c : input.toCharArray()) {
            q.add(c);
            s.push(c);
        }

        boolean isPalindrome = true;

        while (!q.isEmpty()) {
            if (q.remove() != s.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}