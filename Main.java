public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();

        // Sample operations from the assignment
        s.push(10);   // 10 inserted
        s.push(20);   // 20 inserted
        s.push(30);   // 30 inserted

        System.out.print("display(): ");
        s.display();                     // 30 -> 20 -> 10

        System.out.println("peek(): " + s.peek());   // 30

        s.pop();                         // 30 removed
        System.out.print("display(): ");
        s.display();                     // 20 -> 10

        System.out.println("size(): " + s.size());   // 2
        System.out.println("isEmpty(): " + s.isEmpty()); // false

        // Remove remaining elements
        s.pop();   // 20 removed
        s.pop();   // 10 removed
        s.pop();   // Stack Underflow
    }
}
