import java.util.Scanner;

class Node {
    char data;
    Node next;
    Node(char d) { data = d; }
}

public class UseCase8PalindromeCheckerApp {

    static boolean isPalindrome(Node head) {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        while (slow != null) {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        Node first = head, second = prev;

        while (second != null) {
            if (first.data != second.data) return false;
            first = first.next;
            second = second.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Node head = null, tail = null;

        for (char c : input.toCharArray()) {
            Node node = new Node(c);
            if (head == null) head = tail = node;
            else {
                tail.next = node;
                tail = node;
            }
        }

        System.out.println(isPalindrome(head) ? "Palindrome" : "Not Palindrome");
    }
}