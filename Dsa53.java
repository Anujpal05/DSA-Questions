import java.util.Stack;

class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        return -1;
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (!stack2.isEmpty()) {
            return stack2.peek();
        }

        return -1;
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

public class Dsa53 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println("Pop: " + myQueue.pop()); // Output: 1
        System.out.println("Peek: " + myQueue.peek()); // Output: 2
        System.out.println("Is Empty: " + myQueue.empty()); // Output: false
        System.out.println("Pop: " + myQueue.pop()); // return 1, queue is [2]
        System.out.println("Is Empty: " + myQueue.empty()); // Output: false
    }
}
