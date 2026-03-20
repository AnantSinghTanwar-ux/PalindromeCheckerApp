interface Strategy {
    boolean check(String s);
}

class StackStrategy implements Strategy {
    public boolean check(String s) {
        java.util.Stack<Character> st = new java.util.Stack<>();
        for (char c : s.toCharArray()) st.push(c);
        for (char c : s.toCharArray()) {
            if (c != st.pop()) return false;
        }
        return true;
    }
}

class DequeStrategy implements Strategy {
    public boolean check(String s) {
        java.util.Deque<Character> dq = new java.util.ArrayDeque<>();
        for (char c : s.toCharArray()) dq.add(c);
        while (dq.size() > 1) {
            if (dq.removeFirst() != dq.removeLast()) return false;
        }
        return true;
    }
}

public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        Strategy s = new DequeStrategy();
        System.out.println(s.check("racecar") ? "Palindrome" : "Not Palindrome");
    }
}