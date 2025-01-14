package stacks;

// An implementation of IntStack that uses fixed storage.
public class FixedStack implements IntStack {
    private int[] stack;
    private int tos;

    // Allocate and initialize stack.
    public FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    // Push an item onto the stack
    public void push(int item) {
        if (tos == stack.length - 1) {
            System.out.println("Stack is full.");
        } else {
            stack[++tos] = item;
        }
    }

    // Pop an item from the stack
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty.");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}
