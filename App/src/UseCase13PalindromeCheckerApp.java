public class UseCase13PalindromeCheckerApp {

    static boolean twoPointer(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "racecar";

        long start = System.nanoTime();
        twoPointer(input);
        long end = System.nanoTime();

        System.out.println("Time: " + (end - start));
    }
}