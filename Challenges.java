public class Challenges {

    // 1. Reverse a string using the stack
    public static String reverseString(String s) {
        Stack st = new Stack();
        for (char c : s.toCharArray()) {
            st.push(c); // char auto‑casts to int
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append((char) st.pop());
        }
        return sb.toString();
    }

    // 2. Check whether a given string is a palindrome using Stack
    public static boolean isPalindrome(String s) {
        // Remove non‑alphanumeric characters and ignore case
        String clean = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        Stack st = new Stack();
        for (char c : clean.toCharArray()) {
            st.push(c);
        }
        for (char c : clean.toCharArray()) {
            if (c != (char) st.pop()) {
                return false;
            }
        }
        return true;
    }

    // 3. Reverse the elements of a Stack using another Stack
    public static Stack reverseStack(Stack original) {
        Stack reversed = new Stack();
        while (!original.isEmpty()) {
            reversed.push(original.pop());
        }
        return reversed;
    }

    // 4. Find the middle element of a Stack using a Linked List
    // Uses the two‑pointer technique on the underlying linked list.
    public static int findMiddle(Stack s) {
        // 'top' is package‑private in Stack, so we can access it here.
        Node slow = s.top;
        Node fast = s.top;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return (slow != null) ? slow.data : Integer.MIN_VALUE; // sentinel if empty
    }
}
