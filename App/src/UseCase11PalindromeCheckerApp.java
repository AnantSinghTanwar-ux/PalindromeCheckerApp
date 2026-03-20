class PalindromeService {
    boolean check(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeService ps = new PalindromeService();
        System.out.println(ps.check("madam") ? "Palindrome" : "Not Palindrome");
    }
}